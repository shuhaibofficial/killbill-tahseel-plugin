/*! SET storage_engine=INNODB */;

create table tahseel_gateway_requests (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_id char(36) default null
, kb_payment_transaction_id char(36) default null
, tahseel_billing_account char(28) not null
, tahseel_rq_uid char(36) not null
, additional_data longtext default null
, created_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create index tahseel_gateway_requests_kb_account_id on tahseel_gateway_requests(kb_account_id);
create unique index tahseel_gateway_requests_tahseel_billing_account on tahseel_gateway_requests(tahseel_billing_account);
create index tahseel_gateway_requests_kb_payment_transaction_id on tahseel_gateway_requests(kb_payment_transaction_id);

create table tahseel_responses (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_id char(36) not null
, kb_payment_transaction_id char(36) not null
, transaction_type varchar(32) not null
, amount numeric(15,9)
, currency char(3)
, tahseel_billing_account varchar(255) not null
, tahseel_rq_uid char(36) not null
, status_code varchar(32)
, status_message varchar(64)
, additional_data longtext default null
, created_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create index tahseel_responses_kb_payment_id on tahseel_responses(kb_payment_id);
create index tahseel_responses_kb_payment_transaction_id on tahseel_responses(kb_payment_transaction_id);
create index tahseel_responses_tahseel_id on tahseel_responses(tahseel_billing_account);

create table tahseel_payment_methods (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_method_id char(36) not null
, tahseel_id varchar(255) not null
, is_default smallint not null default 0
, is_deleted smallint not null default 0
, additional_data longtext default null
, created_date datetime not null
, updated_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create unique index tahseel_payment_methods_kb_payment_id on tahseel_payment_methods(kb_payment_method_id);
create index tahseel_payment_methods_tahseel_id on tahseel_payment_methods(tahseel_id);

drop table if exists tahseel_notifications;
create table tahseel_notifications (
  record_id serial
, kb_account_id char(36)
, kb_payment_id char(36)
, kb_payment_transaction_id char(36)
, transaction_type varchar(32)
, amount numeric(15,9)
, currency char(3)
, payment_status_code varchar(32)
, payment_date datetime
, tahseel_billing_account varchar(32)
, merchant_reference varchar(64)
, original_reference varchar(64)
, payment_method varchar(32)
, additional_data longtext default null
, created_date datetime not null
, kb_tenant_id char(36)
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
-- Not unique to handle retries
create index tahseel_notifications_tahseel_billing_account on tahseel_notifications(tahseel_billing_account);
create index tahseel_notifications_kb_payment_id on tahseel_notifications(kb_payment_id);
create index tahseel_notifications_kb_payment_transaction_id on tahseel_notifications(kb_payment_transaction_id);
