package org.killbill.billing.plugin.tahseel.cxf.com.ejada;


import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
public class SoapClientTest {
    private static final QName SERVICE_NAME = new QName("http://www.ejada.com", "BillManage");

    private SoapClientTest() {
    }

    public static void main(String[] args) throws java.lang.Exception {

        URL wsdlURL = BillManage_Service.WSDL_LOCATION;

        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        BillManage_Service ss = new BillManage_Service(wsdlURL, SERVICE_NAME);
        BillManage port = ss.getBillManageSOAP12();



        {
            System.out.println("Invoking billManage...");
            UUID uuid = UUID.randomUUID();
            Date today = Calendar.getInstance().getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");

            BillManageRqType _billManage_billManageRq = new BillManageRqType();
            MsgRqHdrType msg_hdr_rq = new MsgRqHdrType();

            msg_hdr_rq.setRqUID(uuid.toString());
            msg_hdr_rq.setSCId("MNFST");
            msg_hdr_rq.setServiceId("BillManage");
            msg_hdr_rq.setFuncId("25000000");
            msg_hdr_rq.setClientDt(simpleDateFormat2.format(today));

            RevenueEntryInfoType revenue_entry_info_type_two = new RevenueEntryInfoType();
            revenue_entry_info_type_two.setBenAgencyId("030001000001000000");
            revenue_entry_info_type_two.setGFSCode("1421901");
            revenue_entry_info_type_two.setAmt(BigDecimal.valueOf(100));

            RevenueEntryInfoType revenue_entry_info_type_one = new RevenueEntryInfoType();
            revenue_entry_info_type_one.setBenAgencyId("777007000000000000");
            revenue_entry_info_type_one.setGFSCode("1421901");
            revenue_entry_info_type_one.setAmt(BigDecimal.valueOf(500));

            RevenueEntryListType revenue_entry_ListType = new RevenueEntryListType();
            List<RevenueEntryInfoType> revenue_entry_info_types  = new ArrayList<RevenueEntryInfoType>();
            revenue_entry_info_types.add(revenue_entry_info_type_one);
            revenue_entry_info_types.add(revenue_entry_info_type_two);

            revenue_entry_ListType.revenueEntryInfo=revenue_entry_info_types;

            BillInfoType bill_info_type = new BillInfoType();

            bill_info_type.setAgencyId("041001000000002000");
            bill_info_type.setBillCategory("APIBill");
            bill_info_type.setBillingAcct("20000095126");
            bill_info_type.setAmt(BigDecimal.valueOf(800));
            BillActionType bill_action_type = BillActionType.fromValue("I");
            bill_info_type.setBillAction(bill_action_type);
            bill_info_type.setDisplayLabelAr("عة دار ا ل حكمة الاهلية ");
            bill_info_type.setDisplayLabelEn("Faculty of DAR ALHEKMA");
            bill_info_type.setBillDueDt(simpleDateFormat.format(today));
            bill_info_type.setBillRefInfo("API");
            bill_info_type.setRevenueEntryList(revenue_entry_ListType);

            BillListType bill_list_type = new BillListType();
            List<BillInfoType> bill_info_types = new ArrayList<>();
            bill_info_types.add(bill_info_type);
            bill_list_type.billInfo = bill_info_types;

            BillManageRqBodyType bill_manage_rq_body_type = new BillManageRqBodyType();
            bill_manage_rq_body_type.setBillList(bill_list_type);

            _billManage_billManageRq.setMsgRqHdr(msg_hdr_rq);
            _billManage_billManageRq.setBody(bill_manage_rq_body_type);

            BillManageRsType _billManage__return = port.billManage(_billManage_billManageRq);
            System.out.println("billManageRs.RQUID=" + _billManage__return.msgRsHdr.getRqUID());
            System.out.println("billManage.statuscode=" + _billManage__return.msgRsHdr.getResponseStatus().statusCode);
            System.out.println("billManage.statusdesc=" + _billManage__return.msgRsHdr.getResponseStatus().getStatusDesc());


        }

        System.exit(0);
    }
}
