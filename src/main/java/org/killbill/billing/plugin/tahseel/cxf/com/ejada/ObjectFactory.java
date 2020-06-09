
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ejada package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BillManageRq_QNAME = new QName("http://www.ejada.com", "BillManageRq");
    private final static QName _BillManageRs_QNAME = new QName("http://www.ejada.com", "BillManageRs");
    private final static QName _BillInfo_QNAME = new QName("http://www.ejada.com", "BillInfo");
    private final static QName _BillList_QNAME = new QName("http://www.ejada.com", "BillList");
    private final static QName _DescAr_QNAME = new QName("http://www.ejada.com", "DescAr");
    private final static QName _DescEn_QNAME = new QName("http://www.ejada.com", "DescEn");
    private final static QName _BillCategory_QNAME = new QName("http://www.ejada.com", "BillCategory");
    private final static QName _BillStatus_QNAME = new QName("http://www.ejada.com", "BillStatus");
    private final static QName _BillCycle_QNAME = new QName("http://www.ejada.com", "BillCycle");
    private final static QName _BillRefInfo_QNAME = new QName("http://www.ejada.com", "BillRefInfo");
    private final static QName _Remarks_QNAME = new QName("http://www.ejada.com", "Remarks");
    private final static QName _UpdateDt_QNAME = new QName("http://www.ejada.com", "UpdateDt");
    private final static QName _CreateDt_QNAME = new QName("http://www.ejada.com", "CreateDt");
    private final static QName _RejectionDt_QNAME = new QName("http://www.ejada.com", "RejectionDt");
    private final static QName _BenAcctInfo_QNAME = new QName("http://www.ejada.com", "BenAcctInfo");
    private final static QName _ResponseStatus_QNAME = new QName("http://www.ejada.com", "ResponseStatus");
    private final static QName _POINum_QNAME = new QName("http://www.ejada.com", "POINum");
    private final static QName _POIType_QNAME = new QName("http://www.ejada.com", "POIType");
    private final static QName _Amt_QNAME = new QName("http://www.ejada.com", "Amt");
    private final static QName _ClientDt_QNAME = new QName("http://www.ejada.com", "ClientDt");
    private final static QName _EchoData_QNAME = new QName("http://www.ejada.com", "EchoData");
    private final static QName _FuncId_QNAME = new QName("http://www.ejada.com", "FuncId");
    private final static QName _MsgRecDt_QNAME = new QName("http://www.ejada.com", "MsgRecDt");
    private final static QName _MsgRqHdr_QNAME = new QName("http://www.ejada.com", "MsgRqHdr");
    private final static QName _MsgRsHdr_QNAME = new QName("http://www.ejada.com", "MsgRsHdr");
    private final static QName _OverrideStatus_QNAME = new QName("http://www.ejada.com", "OverrideStatus");
    private final static QName _PartyIdNum_QNAME = new QName("http://www.ejada.com", "PartyIdNum");
    private final static QName _PartyIdType_QNAME = new QName("http://www.ejada.com", "PartyIdType");
    private final static QName _RqMode_QNAME = new QName("http://www.ejada.com", "RqMode");
    private final static QName _RqUID_QNAME = new QName("http://www.ejada.com", "RqUID");
    private final static QName _SCId_QNAME = new QName("http://www.ejada.com", "SCId");
    private final static QName _SPRefNum_QNAME = new QName("http://www.ejada.com", "SPRefNum");
    private final static QName _StatusCode_QNAME = new QName("http://www.ejada.com", "StatusCode");
    private final static QName _RejectionReason_QNAME = new QName("http://www.ejada.com", "RejectionReason");
    private final static QName _StatusDesc_QNAME = new QName("http://www.ejada.com", "StatusDesc");
    private final static QName _Version_QNAME = new QName("http://www.ejada.com", "Version");
    private final static QName _UserId_QNAME = new QName("http://www.ejada.com", "UserId");
    private final static QName _ProcessUID_QNAME = new QName("http://www.ejada.com", "ProcessUID");
    private final static QName _ProxyUserId_QNAME = new QName("http://www.ejada.com", "ProxyUserId");
    private final static QName _ServiceId_QNAME = new QName("http://www.ejada.com", "ServiceId");
    private final static QName _SessionId_QNAME = new QName("http://www.ejada.com", "SessionId");
    private final static QName _AgencyId_QNAME = new QName("http://www.ejada.com", "AgencyId");
    private final static QName _PartyId_QNAME = new QName("http://www.ejada.com", "PartyId");
    private final static QName _BankBranchId_QNAME = new QName("http://www.ejada.com", "BankBranchId");
    private final static QName _PreferContactFlag_QNAME = new QName("http://www.ejada.com", "PreferContactFlag");
    private final static QName _GFSCode_QNAME = new QName("http://www.ejada.com", "GFSCode");
    private final static QName _ChapterNum_QNAME = new QName("http://www.ejada.com", "ChapterNum");
    private final static QName _Email_QNAME = new QName("http://www.ejada.com", "Email");
    private final static QName _FaxNum_QNAME = new QName("http://www.ejada.com", "FaxNum");
    private final static QName _FullNameAr_QNAME = new QName("http://www.ejada.com", "FullNameAr");
    private final static QName _FullName_QNAME = new QName("http://www.ejada.com", "FullName");
    private final static QName _HomePhone_QNAME = new QName("http://www.ejada.com", "HomePhone");
    private final static QName _HomePhoneExtension_QNAME = new QName("http://www.ejada.com", "HomePhoneExtension");
    private final static QName _MobileNum_QNAME = new QName("http://www.ejada.com", "MobileNum");
    private final static QName _Pager_QNAME = new QName("http://www.ejada.com", "Pager");
    private final static QName _PreferLang_QNAME = new QName("http://www.ejada.com", "PreferLang");
    private final static QName _BillerContactsInfo_QNAME = new QName("http://www.ejada.com", "BillerContactsInfo");
    private final static QName _BillMetadata_QNAME = new QName("http://www.ejada.com", "BillMetadata");
    private final static QName _BillerId_QNAME = new QName("http://www.ejada.com", "BillerId");
    private final static QName _BillingAcct_QNAME = new QName("http://www.ejada.com", "BillingAcct");
    private final static QName _BillDesc_QNAME = new QName("http://www.ejada.com", "BillDesc");
    private final static QName _BillRefNum_QNAME = new QName("http://www.ejada.com", "BillRefNum");
    private final static QName _BillId_QNAME = new QName("http://www.ejada.com", "BillId");
    private final static QName _WorkPhone_QNAME = new QName("http://www.ejada.com", "WorkPhone");
    private final static QName _WorkPhoneExtension_QNAME = new QName("http://www.ejada.com", "WorkPhoneExtension");
    private final static QName _SectionId_QNAME = new QName("http://www.ejada.com", "SectionId");
    private final static QName _BillDueDt_QNAME = new QName("http://www.ejada.com", "BillDueDt");
    private final static QName _BillExpiryDt_QNAME = new QName("http://www.ejada.com", "BillExpiryDt");
    private final static QName _CustomerInfo_QNAME = new QName("http://www.ejada.com", "CustomerInfo");
    private final static QName _ParamItem_QNAME = new QName("http://www.ejada.com", "ParamItem");
    private final static QName _ParamCd_QNAME = new QName("http://www.ejada.com", "ParamCd");
    private final static QName _ParamVal_QNAME = new QName("http://www.ejada.com", "ParamVal");
    private final static QName _DateTime_QNAME = new QName("http://www.ejada.com", "DateTime");
    private final static QName _SequenceNumber_QNAME = new QName("http://www.ejada.com", "SequenceNumber");
    private final static QName _NumOfSubSections_QNAME = new QName("http://www.ejada.com", "NumOfSubSections");
    private final static QName _NumOfSubDepartments_QNAME = new QName("http://www.ejada.com", "NumOfSubDepartments");
    private final static QName _BenName_QNAME = new QName("http://www.ejada.com", "BenName");
    private final static QName _BenPOI_QNAME = new QName("http://www.ejada.com", "BenPOI");
    private final static QName _MinPartialPmtAmt_QNAME = new QName("http://www.ejada.com", "MinPartialPmtAmt");
    private final static QName _MinAdvancePmtAmt_QNAME = new QName("http://www.ejada.com", "MinAdvancePmtAmt");
    private final static QName _MaxAdvancePmtAmt_QNAME = new QName("http://www.ejada.com", "MaxAdvancePmtAmt");
    private final static QName _PmtOptions_QNAME = new QName("http://www.ejada.com", "PmtOptions");
    private final static QName _BenInfo_QNAME = new QName("http://www.ejada.com", "BenInfo");
    private final static QName _BillSummList_QNAME = new QName("http://www.ejada.com", "BillSummList");
    private final static QName _BatchId_QNAME = new QName("http://www.ejada.com", "BatchId");
    private final static QName _BillNum_QNAME = new QName("http://www.ejada.com", "BillNum");
    private final static QName _BillAction_QNAME = new QName("http://www.ejada.com", "BillAction");
    private final static QName _ActionReason_QNAME = new QName("http://www.ejada.com", "ActionReason");
    private final static QName _DisplayLabelAr_QNAME = new QName("http://www.ejada.com", "DisplayLabelAr");
    private final static QName _DisplayLabelEn_QNAME = new QName("http://www.ejada.com", "DisplayLabelEn");
    private final static QName _RevenueEntryList_QNAME = new QName("http://www.ejada.com", "RevenueEntryList");
    private final static QName _RevenueEntryInfo_QNAME = new QName("http://www.ejada.com", "RevenueEntryInfo");
    private final static QName _BenAgencyId_QNAME = new QName("http://www.ejada.com", "BenAgencyId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ejada
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BillManageRqType }
     * 
     */
    public BillManageRqType createBillManageRqType() {
        return new BillManageRqType();
    }

    /**
     * Create an instance of {@link BillManageRsType }
     * 
     */
    public BillManageRsType createBillManageRsType() {
        return new BillManageRsType();
    }

    /**
     * Create an instance of {@link BillInfoType }
     * 
     */
    public BillInfoType createBillInfoType() {
        return new BillInfoType();
    }

    /**
     * Create an instance of {@link BillListType }
     * 
     */
    public BillListType createBillListType() {
        return new BillListType();
    }

    /**
     * Create an instance of {@link BenAcctInfoType }
     * 
     */
    public BenAcctInfoType createBenAcctInfoType() {
        return new BenAcctInfoType();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     * 
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link MsgRqHdrType }
     * 
     */
    public MsgRqHdrType createMsgRqHdrType() {
        return new MsgRqHdrType();
    }

    /**
     * Create an instance of {@link MsgRsHdrType }
     * 
     */
    public MsgRsHdrType createMsgRsHdrType() {
        return new MsgRsHdrType();
    }

    /**
     * Create an instance of {@link OverrideStatusType }
     * 
     */
    public OverrideStatusType createOverrideStatusType() {
        return new OverrideStatusType();
    }

    /**
     * Create an instance of {@link PartyIdType }
     * 
     */
    public PartyIdType createPartyIdType() {
        return new PartyIdType();
    }

    /**
     * Create an instance of {@link BillerContactsInfoType }
     * 
     */
    public BillerContactsInfoType createBillerContactsInfoType() {
        return new BillerContactsInfoType();
    }

    /**
     * Create an instance of {@link ParamListType }
     * 
     */
    public ParamListType createParamListType() {
        return new ParamListType();
    }

    /**
     * Create an instance of {@link CustomerInfoType }
     * 
     */
    public CustomerInfoType createCustomerInfoType() {
        return new CustomerInfoType();
    }

    /**
     * Create an instance of {@link ParamItemType }
     * 
     */
    public ParamItemType createParamItemType() {
        return new ParamItemType();
    }

    /**
     * Create an instance of {@link POIType }
     * 
     */
    public POIType createPOIType() {
        return new POIType();
    }

    /**
     * Create an instance of {@link PmtOptionsType }
     * 
     */
    public PmtOptionsType createPmtOptionsType() {
        return new PmtOptionsType();
    }

    /**
     * Create an instance of {@link BenInfoType }
     * 
     */
    public BenInfoType createBenInfoType() {
        return new BenInfoType();
    }

    /**
     * Create an instance of {@link BillSummListType }
     * 
     */
    public BillSummListType createBillSummListType() {
        return new BillSummListType();
    }

    /**
     * Create an instance of {@link RevenueEntryListType }
     * 
     */
    public RevenueEntryListType createRevenueEntryListType() {
        return new RevenueEntryListType();
    }

    /**
     * Create an instance of {@link RevenueEntryInfoType }
     * 
     */
    public RevenueEntryInfoType createRevenueEntryInfoType() {
        return new RevenueEntryInfoType();
    }

    /**
     * Create an instance of {@link BillManageRqBodyType }
     * 
     */
    public BillManageRqBodyType createBillManageRqBodyType() {
        return new BillManageRqBodyType();
    }

    /**
     * Create an instance of {@link BillManageRsBodyType }
     * 
     */
    public BillManageRsBodyType createBillManageRsBodyType() {
        return new BillManageRsBodyType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link BillRecType }
     * 
     */
    public BillRecType createBillRecType() {
        return new BillRecType();
    }

    /**
     * Create an instance of {@link AcctDtlsType }
     * 
     */
    public AcctDtlsType createAcctDtlsType() {
        return new AcctDtlsType();
    }

    /**
     * Create an instance of {@link BillSummInfoType }
     * 
     */
    public BillSummInfoType createBillSummInfoType() {
        return new BillSummInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillManageRqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillManageRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillManageRq")
    public JAXBElement<BillManageRqType> createBillManageRq(BillManageRqType value) {
        return new JAXBElement<BillManageRqType>(_BillManageRq_QNAME, BillManageRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillManageRsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillManageRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillManageRs")
    public JAXBElement<BillManageRsType> createBillManageRs(BillManageRsType value) {
        return new JAXBElement<BillManageRsType>(_BillManageRs_QNAME, BillManageRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillInfo")
    public JAXBElement<BillInfoType> createBillInfo(BillInfoType value) {
        return new JAXBElement<BillInfoType>(_BillInfo_QNAME, BillInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillList")
    public JAXBElement<BillListType> createBillList(BillListType value) {
        return new JAXBElement<BillListType>(_BillList_QNAME, BillListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "DescAr")
    public JAXBElement<String> createDescAr(String value) {
        return new JAXBElement<String>(_DescAr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "DescEn")
    public JAXBElement<String> createDescEn(String value) {
        return new JAXBElement<String>(_DescEn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillCategory")
    public JAXBElement<String> createBillCategory(String value) {
        return new JAXBElement<String>(_BillCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillStatus")
    public JAXBElement<String> createBillStatus(String value) {
        return new JAXBElement<String>(_BillStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillCycle")
    public JAXBElement<String> createBillCycle(String value) {
        return new JAXBElement<String>(_BillCycle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillRefInfo")
    public JAXBElement<String> createBillRefInfo(String value) {
        return new JAXBElement<String>(_BillRefInfo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "Remarks")
    public JAXBElement<String> createRemarks(String value) {
        return new JAXBElement<String>(_Remarks_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "UpdateDt")
    public JAXBElement<XMLGregorianCalendar> createUpdateDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "CreateDt")
    public JAXBElement<XMLGregorianCalendar> createCreateDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreateDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RejectionDt")
    public JAXBElement<XMLGregorianCalendar> createRejectionDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RejectionDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BenAcctInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BenAcctInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BenAcctInfo")
    public JAXBElement<BenAcctInfoType> createBenAcctInfo(BenAcctInfoType value) {
        return new JAXBElement<BenAcctInfoType>(_BenAcctInfo_QNAME, BenAcctInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ResponseStatus")
    public JAXBElement<ResponseStatusType> createResponseStatus(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(_ResponseStatus_QNAME, ResponseStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "POINum")
    public JAXBElement<String> createPOINum(String value) {
        return new JAXBElement<String>(_POINum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "POIType")
    public JAXBElement<String> createPOIType(String value) {
        return new JAXBElement<String>(_POIType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "Amt")
    public JAXBElement<BigDecimal> createAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ClientDt")
    public JAXBElement<String> createClientDt(String value) {
        return new JAXBElement<String>(_ClientDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "EchoData")
    public JAXBElement<String> createEchoData(String value) {
        return new JAXBElement<String>(_EchoData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "FuncId")
    public JAXBElement<String> createFuncId(String value) {
        return new JAXBElement<String>(_FuncId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MsgRecDt")
    public JAXBElement<String> createMsgRecDt(String value) {
        return new JAXBElement<String>(_MsgRecDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRqHdrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgRqHdrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MsgRqHdr")
    public JAXBElement<MsgRqHdrType> createMsgRqHdr(MsgRqHdrType value) {
        return new JAXBElement<MsgRqHdrType>(_MsgRqHdr_QNAME, MsgRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRsHdrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgRsHdrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MsgRsHdr")
    public JAXBElement<MsgRsHdrType> createMsgRsHdr(MsgRsHdrType value) {
        return new JAXBElement<MsgRsHdrType>(_MsgRsHdr_QNAME, MsgRsHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverrideStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OverrideStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "OverrideStatus")
    public JAXBElement<OverrideStatusType> createOverrideStatus(OverrideStatusType value) {
        return new JAXBElement<OverrideStatusType>(_OverrideStatus_QNAME, OverrideStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PartyIdNum")
    public JAXBElement<String> createPartyIdNum(String value) {
        return new JAXBElement<String>(_PartyIdNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PartyIdType")
    public JAXBElement<String> createPartyIdType(String value) {
        return new JAXBElement<String>(_PartyIdType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RqMode")
    public JAXBElement<Long> createRqMode(Long value) {
        return new JAXBElement<Long>(_RqMode_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RqUID")
    public JAXBElement<String> createRqUID(String value) {
        return new JAXBElement<String>(_RqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "SCId")
    public JAXBElement<String> createSCId(String value) {
        return new JAXBElement<String>(_SCId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "SPRefNum")
    public JAXBElement<String> createSPRefNum(String value) {
        return new JAXBElement<String>(_SPRefNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "StatusCode")
    public JAXBElement<String> createStatusCode(String value) {
        return new JAXBElement<String>(_StatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RejectionReason")
    public JAXBElement<String> createRejectionReason(String value) {
        return new JAXBElement<String>(_RejectionReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "StatusDesc")
    public JAXBElement<String> createStatusDesc(String value) {
        return new JAXBElement<String>(_StatusDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "Version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ProcessUID")
    public JAXBElement<String> createProcessUID(String value) {
        return new JAXBElement<String>(_ProcessUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ProxyUserId")
    public JAXBElement<String> createProxyUserId(String value) {
        return new JAXBElement<String>(_ProxyUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ServiceId")
    public JAXBElement<String> createServiceId(String value) {
        return new JAXBElement<String>(_ServiceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "SessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "AgencyId")
    public JAXBElement<String> createAgencyId(String value) {
        return new JAXBElement<String>(_AgencyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartyIdType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PartyId")
    public JAXBElement<PartyIdType> createPartyId(PartyIdType value) {
        return new JAXBElement<PartyIdType>(_PartyId_QNAME, PartyIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BankBranchId")
    public JAXBElement<String> createBankBranchId(String value) {
        return new JAXBElement<String>(_BankBranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PreferContactFlag")
    public JAXBElement<Boolean> createPreferContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PreferContactFlag_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "GFSCode")
    public JAXBElement<String> createGFSCode(String value) {
        return new JAXBElement<String>(_GFSCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ChapterNum")
    public JAXBElement<BigInteger> createChapterNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_ChapterNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "FaxNum")
    public JAXBElement<String> createFaxNum(String value) {
        return new JAXBElement<String>(_FaxNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "FullNameAr")
    public JAXBElement<String> createFullNameAr(String value) {
        return new JAXBElement<String>(_FullNameAr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "FullName")
    public JAXBElement<String> createFullName(String value) {
        return new JAXBElement<String>(_FullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "HomePhone")
    public JAXBElement<String> createHomePhone(String value) {
        return new JAXBElement<String>(_HomePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "HomePhoneExtension")
    public JAXBElement<String> createHomePhoneExtension(String value) {
        return new JAXBElement<String>(_HomePhoneExtension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MobileNum")
    public JAXBElement<String> createMobileNum(String value) {
        return new JAXBElement<String>(_MobileNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "Pager")
    public JAXBElement<String> createPager(String value) {
        return new JAXBElement<String>(_Pager_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PreferLang")
    public JAXBElement<String> createPreferLang(String value) {
        return new JAXBElement<String>(_PreferLang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillerContactsInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillerContactsInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillerContactsInfo")
    public JAXBElement<BillerContactsInfoType> createBillerContactsInfo(BillerContactsInfoType value) {
        return new JAXBElement<BillerContactsInfoType>(_BillerContactsInfo_QNAME, BillerContactsInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillMetadata")
    public JAXBElement<ParamListType> createBillMetadata(ParamListType value) {
        return new JAXBElement<ParamListType>(_BillMetadata_QNAME, ParamListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillerId")
    public JAXBElement<String> createBillerId(String value) {
        return new JAXBElement<String>(_BillerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillingAcct")
    public JAXBElement<String> createBillingAcct(String value) {
        return new JAXBElement<String>(_BillingAcct_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillDesc")
    public JAXBElement<String> createBillDesc(String value) {
        return new JAXBElement<String>(_BillDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillRefNum")
    public JAXBElement<String> createBillRefNum(String value) {
        return new JAXBElement<String>(_BillRefNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillId")
    public JAXBElement<String> createBillId(String value) {
        return new JAXBElement<String>(_BillId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "WorkPhone")
    public JAXBElement<String> createWorkPhone(String value) {
        return new JAXBElement<String>(_WorkPhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "WorkPhoneExtension")
    public JAXBElement<String> createWorkPhoneExtension(String value) {
        return new JAXBElement<String>(_WorkPhoneExtension_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "SectionId")
    public JAXBElement<String> createSectionId(String value) {
        return new JAXBElement<String>(_SectionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillDueDt")
    public JAXBElement<String> createBillDueDt(String value) {
        return new JAXBElement<String>(_BillDueDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillExpiryDt")
    public JAXBElement<String> createBillExpiryDt(String value) {
        return new JAXBElement<String>(_BillExpiryDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "CustomerInfo")
    public JAXBElement<CustomerInfoType> createCustomerInfo(CustomerInfoType value) {
        return new JAXBElement<CustomerInfoType>(_CustomerInfo_QNAME, CustomerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParamItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ParamItem")
    public JAXBElement<ParamItemType> createParamItem(ParamItemType value) {
        return new JAXBElement<ParamItemType>(_ParamItem_QNAME, ParamItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ParamCd")
    public JAXBElement<String> createParamCd(String value) {
        return new JAXBElement<String>(_ParamCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ParamVal")
    public JAXBElement<String> createParamVal(String value) {
        return new JAXBElement<String>(_ParamVal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "DateTime")
    public JAXBElement<String> createDateTime(String value) {
        return new JAXBElement<String>(_DateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "SequenceNumber")
    public JAXBElement<String> createSequenceNumber(String value) {
        return new JAXBElement<String>(_SequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "NumOfSubSections")
    public JAXBElement<BigInteger> createNumOfSubSections(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumOfSubSections_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "NumOfSubDepartments")
    public JAXBElement<BigInteger> createNumOfSubDepartments(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumOfSubDepartments_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BenName")
    public JAXBElement<String> createBenName(String value) {
        return new JAXBElement<String>(_BenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link POIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BenPOI")
    public JAXBElement<POIType> createBenPOI(POIType value) {
        return new JAXBElement<POIType>(_BenPOI_QNAME, POIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MinPartialPmtAmt")
    public JAXBElement<BigDecimal> createMinPartialPmtAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MinPartialPmtAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MinAdvancePmtAmt")
    public JAXBElement<BigDecimal> createMinAdvancePmtAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MinAdvancePmtAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "MaxAdvancePmtAmt")
    public JAXBElement<BigDecimal> createMaxAdvancePmtAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaxAdvancePmtAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtOptionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PmtOptionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "PmtOptions")
    public JAXBElement<PmtOptionsType> createPmtOptions(PmtOptionsType value) {
        return new JAXBElement<PmtOptionsType>(_PmtOptions_QNAME, PmtOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BenInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BenInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BenInfo")
    public JAXBElement<BenInfoType> createBenInfo(BenInfoType value) {
        return new JAXBElement<BenInfoType>(_BenInfo_QNAME, BenInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillSummListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillSummListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillSummList")
    public JAXBElement<BillSummListType> createBillSummList(BillSummListType value) {
        return new JAXBElement<BillSummListType>(_BillSummList_QNAME, BillSummListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BatchId")
    public JAXBElement<String> createBatchId(String value) {
        return new JAXBElement<String>(_BatchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillNum")
    public JAXBElement<String> createBillNum(String value) {
        return new JAXBElement<String>(_BillNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillActionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BillActionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BillAction")
    public JAXBElement<BillActionType> createBillAction(BillActionType value) {
        return new JAXBElement<BillActionType>(_BillAction_QNAME, BillActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "ActionReason")
    public JAXBElement<String> createActionReason(String value) {
        return new JAXBElement<String>(_ActionReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "DisplayLabelAr")
    public JAXBElement<String> createDisplayLabelAr(String value) {
        return new JAXBElement<String>(_DisplayLabelAr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "DisplayLabelEn")
    public JAXBElement<String> createDisplayLabelEn(String value) {
        return new JAXBElement<String>(_DisplayLabelEn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueEntryListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevenueEntryListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RevenueEntryList")
    public JAXBElement<RevenueEntryListType> createRevenueEntryList(RevenueEntryListType value) {
        return new JAXBElement<RevenueEntryListType>(_RevenueEntryList_QNAME, RevenueEntryListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueEntryInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevenueEntryInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "RevenueEntryInfo")
    public JAXBElement<RevenueEntryInfoType> createRevenueEntryInfo(RevenueEntryInfoType value) {
        return new JAXBElement<RevenueEntryInfoType>(_RevenueEntryInfo_QNAME, RevenueEntryInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ejada.com", name = "BenAgencyId")
    public JAXBElement<String> createBenAgencyId(String value) {
        return new JAXBElement<String>(_BenAgencyId_QNAME, String.class, null, value);
    }

}
