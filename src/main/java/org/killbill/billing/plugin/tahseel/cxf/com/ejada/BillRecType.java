
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}BillNum" minOccurs="0"/&gt;
 *         &lt;element name="AgencyId" type="{http://www.ejada.com}TahseelAgencyId_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}RejectionReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillingAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillCycle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillAction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ActionReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DisplayLabelAr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DisplayLabelEn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillDueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillExpiryDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}CustomerInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillRefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PmtOptions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillSummList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BenInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}RevenueEntryList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BenAcctInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillerContactsInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PreferLang" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Remarks" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillMetadata" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}CreateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}UpdateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}RejectionDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillRec_Type", propOrder = {
    "billNum",
    "agencyId",
    "billId",
    "billDesc",
    "billRefNum",
    "billCategory",
    "billStatus",
    "rejectionReason",
    "billingAcct",
    "billCycle",
    "amt",
    "billAction",
    "actionReason",
    "displayLabelAr",
    "displayLabelEn",
    "billDueDt",
    "billExpiryDt",
    "customerInfo",
    "billRefInfo",
    "pmtOptions",
    "billSummList",
    "benInfo",
    "revenueEntryList",
    "benAcctInfo",
    "billerId",
    "billerContactsInfo",
    "preferLang",
    "remarks",
    "billMetadata",
    "createDt",
    "updateDt",
    "rejectionDt"
})
@XmlSeeAlso({
    BillInfoType.class
})
public class BillRecType {

    @XmlElement(name = "BillNum")
    protected String billNum;
    @XmlElement(name = "AgencyId")
    protected String agencyId;
    @XmlElement(name = "BillId")
    protected String billId;
    @XmlElement(name = "BillDesc")
    protected String billDesc;
    @XmlElement(name = "BillRefNum")
    protected String billRefNum;
    @XmlElement(name = "BillCategory")
    protected String billCategory;
    @XmlElement(name = "BillStatus")
    protected String billStatus;
    @XmlElement(name = "RejectionReason")
    protected String rejectionReason;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "BillCycle")
    protected String billCycle;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "BillAction")
    @XmlSchemaType(name = "string")
    protected BillActionType billAction;
    @XmlElement(name = "ActionReason")
    protected String actionReason;
    @XmlElement(name = "DisplayLabelAr")
    protected String displayLabelAr;
    @XmlElement(name = "DisplayLabelEn")
    protected String displayLabelEn;
    @XmlElement(name = "BillDueDt")
    protected String billDueDt;
    @XmlElement(name = "BillExpiryDt")
    protected String billExpiryDt;
    @XmlElement(name = "CustomerInfo")
    protected CustomerInfoType customerInfo;
    @XmlElement(name = "BillRefInfo")
    protected String billRefInfo;
    @XmlElement(name = "PmtOptions")
    protected PmtOptionsType pmtOptions;
    @XmlElement(name = "BillSummList")
    protected BillSummListType billSummList;
    @XmlElement(name = "BenInfo")
    protected BenInfoType benInfo;
    @XmlElement(name = "RevenueEntryList")
    protected RevenueEntryListType revenueEntryList;
    @XmlElement(name = "BenAcctInfo")
    protected BenAcctInfoType benAcctInfo;
    @XmlElement(name = "BillerId")
    protected String billerId;
    @XmlElement(name = "BillerContactsInfo")
    protected BillerContactsInfoType billerContactsInfo;
    @XmlElement(name = "PreferLang")
    protected String preferLang;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "BillMetadata")
    protected ParamListType billMetadata;
    @XmlElement(name = "CreateDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlElement(name = "UpdateDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDt;
    @XmlElement(name = "RejectionDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rejectionDt;

    /**
     * Gets the value of the billNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNum() {
        return billNum;
    }

    /**
     * Sets the value of the billNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNum(String value) {
        this.billNum = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDesc() {
        return billDesc;
    }

    /**
     * Sets the value of the billDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDesc(String value) {
        this.billDesc = value;
    }

    /**
     * Gets the value of the billRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefNum() {
        return billRefNum;
    }

    /**
     * Sets the value of the billRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefNum(String value) {
        this.billRefNum = value;
    }

    /**
     * Gets the value of the billCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCategory() {
        return billCategory;
    }

    /**
     * Sets the value of the billCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCategory(String value) {
        this.billCategory = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillStatus(String value) {
        this.billStatus = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the billAction property.
     * 
     * @return
     *     possible object is
     *     {@link BillActionType }
     *     
     */
    public BillActionType getBillAction() {
        return billAction;
    }

    /**
     * Sets the value of the billAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillActionType }
     *     
     */
    public void setBillAction(BillActionType value) {
        this.billAction = value;
    }

    /**
     * Gets the value of the actionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReason() {
        return actionReason;
    }

    /**
     * Sets the value of the actionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReason(String value) {
        this.actionReason = value;
    }

    /**
     * Gets the value of the displayLabelAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabelAr() {
        return displayLabelAr;
    }

    /**
     * Sets the value of the displayLabelAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabelAr(String value) {
        this.displayLabelAr = value;
    }

    /**
     * Gets the value of the displayLabelEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLabelEn() {
        return displayLabelEn;
    }

    /**
     * Sets the value of the displayLabelEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLabelEn(String value) {
        this.displayLabelEn = value;
    }

    /**
     * Gets the value of the billDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDueDt() {
        return billDueDt;
    }

    /**
     * Sets the value of the billDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDueDt(String value) {
        this.billDueDt = value;
    }

    /**
     * Gets the value of the billExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillExpiryDt() {
        return billExpiryDt;
    }

    /**
     * Sets the value of the billExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillExpiryDt(String value) {
        this.billExpiryDt = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the billRefInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefInfo() {
        return billRefInfo;
    }

    /**
     * Sets the value of the billRefInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefInfo(String value) {
        this.billRefInfo = value;
    }

    /**
     * Gets the value of the pmtOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PmtOptionsType }
     *     
     */
    public PmtOptionsType getPmtOptions() {
        return pmtOptions;
    }

    /**
     * Sets the value of the pmtOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtOptionsType }
     *     
     */
    public void setPmtOptions(PmtOptionsType value) {
        this.pmtOptions = value;
    }

    /**
     * Gets the value of the billSummList property.
     * 
     * @return
     *     possible object is
     *     {@link BillSummListType }
     *     
     */
    public BillSummListType getBillSummList() {
        return billSummList;
    }

    /**
     * Sets the value of the billSummList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSummListType }
     *     
     */
    public void setBillSummList(BillSummListType value) {
        this.billSummList = value;
    }

    /**
     * Gets the value of the benInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BenInfoType }
     *     
     */
    public BenInfoType getBenInfo() {
        return benInfo;
    }

    /**
     * Sets the value of the benInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenInfoType }
     *     
     */
    public void setBenInfo(BenInfoType value) {
        this.benInfo = value;
    }

    /**
     * Gets the value of the revenueEntryList property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueEntryListType }
     *     
     */
    public RevenueEntryListType getRevenueEntryList() {
        return revenueEntryList;
    }

    /**
     * Sets the value of the revenueEntryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueEntryListType }
     *     
     */
    public void setRevenueEntryList(RevenueEntryListType value) {
        this.revenueEntryList = value;
    }

    /**
     * Gets the value of the benAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BenAcctInfoType }
     *     
     */
    public BenAcctInfoType getBenAcctInfo() {
        return benAcctInfo;
    }

    /**
     * Sets the value of the benAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenAcctInfoType }
     *     
     */
    public void setBenAcctInfo(BenAcctInfoType value) {
        this.benAcctInfo = value;
    }

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerId(String value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the billerContactsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerContactsInfoType }
     *     
     */
    public BillerContactsInfoType getBillerContactsInfo() {
        return billerContactsInfo;
    }

    /**
     * Sets the value of the billerContactsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerContactsInfoType }
     *     
     */
    public void setBillerContactsInfo(BillerContactsInfoType value) {
        this.billerContactsInfo = value;
    }

    /**
     * Gets the value of the preferLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferLang() {
        return preferLang;
    }

    /**
     * Sets the value of the preferLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferLang(String value) {
        this.preferLang = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the billMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ParamListType }
     *     
     */
    public ParamListType getBillMetadata() {
        return billMetadata;
    }

    /**
     * Sets the value of the billMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamListType }
     *     
     */
    public void setBillMetadata(ParamListType value) {
        this.billMetadata = value;
    }

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDt(XMLGregorianCalendar value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the updateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDt() {
        return updateDt;
    }

    /**
     * Sets the value of the updateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDt(XMLGregorianCalendar value) {
        this.updateDt = value;
    }

    /**
     * Gets the value of the rejectionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectionDt() {
        return rejectionDt;
    }

    /**
     * Sets the value of the rejectionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectionDt(XMLGregorianCalendar value) {
        this.rejectionDt = value;
    }

}
