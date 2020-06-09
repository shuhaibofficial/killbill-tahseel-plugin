
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctDtls_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctDtls_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}AgencyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ChapterNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BankBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SectionId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SequenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}NumOfSubDepartments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}NumOfSubSections" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctDtls_type", propOrder = {
    "agencyId",
    "chapterNum",
    "bankBranchId",
    "sectionId",
    "sequenceNumber",
    "numOfSubDepartments",
    "numOfSubSections"
})
@XmlSeeAlso({
    BenAcctInfoType.class
})
public class AcctDtlsType {

    @XmlElement(name = "AgencyId")
    protected String agencyId;
    @XmlElement(name = "ChapterNum")
    protected BigInteger chapterNum;
    @XmlElement(name = "BankBranchId")
    protected String bankBranchId;
    @XmlElement(name = "SectionId")
    protected String sectionId;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "NumOfSubDepartments")
    protected BigInteger numOfSubDepartments;
    @XmlElement(name = "NumOfSubSections")
    protected BigInteger numOfSubSections;

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
     * Gets the value of the chapterNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChapterNum() {
        return chapterNum;
    }

    /**
     * Sets the value of the chapterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChapterNum(BigInteger value) {
        this.chapterNum = value;
    }

    /**
     * Gets the value of the bankBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchId() {
        return bankBranchId;
    }

    /**
     * Sets the value of the bankBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchId(String value) {
        this.bankBranchId = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the numOfSubDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfSubDepartments() {
        return numOfSubDepartments;
    }

    /**
     * Sets the value of the numOfSubDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfSubDepartments(BigInteger value) {
        this.numOfSubDepartments = value;
    }

    /**
     * Gets the value of the numOfSubSections property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfSubSections() {
        return numOfSubSections;
    }

    /**
     * Sets the value of the numOfSubSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfSubSections(BigInteger value) {
        this.numOfSubSections = value;
    }

}
