/*! SET storage_engine=INNODB */;

create table purchase_hpp_requests (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_id char(36) default null
, kb_payment_transaction_id char(36) default null
, session_id varchar(255) not null
, additional_data longtext default null
, created_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create index purchase_hpp_requests_kb_account_id on purchase_hpp_requests(kb_account_id);
create unique index purchase_hpp_requests_kb_session_id on purchase_hpp_requests(session_id);
create index purchase_hpp_requests_kb_payment_transaction_id on purchase_hpp_requests(kb_payment_transaction_id);

create table purchase_responses (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_id char(36) not null
, kb_payment_transaction_id char(36) not null
, transaction_type varchar(32) not null
, amount numeric(15,9)
, currency char(3)
, purchase_id varchar(255) not null
, additional_data longtext default null
, created_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create index purchase_responses_kb_payment_id on purchase_responses(kb_payment_id);
create index purchase_responses_kb_payment_transaction_id on purchase_responses(kb_payment_transaction_id);
create index purchase_responses_purchase_id on purchase_responses(purchase_id);

create table purchase_payment_methods (
  record_id serial
, kb_account_id char(36) not null
, kb_payment_method_id char(36) not null
, purchase_id varchar(255) not null
, is_default smallint not null default 0
, is_deleted smallint not null default 0
, additional_data longtext default null
, created_date datetime not null
, updated_date datetime not null
, kb_tenant_id char(36) not null
, primary key(record_id)
) /*! CHARACTER SET utf8 COLLATE utf8_bin */;
create unique index purchase_payment_methods_kb_payment_id on purchase_payment_methods(kb_payment_method_id);
create index purchase_payment_methods_purchase_id on purchase_payment_methods(purchase_id);
