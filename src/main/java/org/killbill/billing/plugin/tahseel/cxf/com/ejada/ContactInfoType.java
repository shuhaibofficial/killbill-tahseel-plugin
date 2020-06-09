
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}PreferLang" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{http://www.ejada.com}HomePhone" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ejada.com}HomePhoneExtension" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{http://www.ejada.com}WorkPhone" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ejada.com}WorkPhoneExtension" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}MobileNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Email" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}FaxNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Pager" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PreferContactFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo_Type", propOrder = {
    "preferLang",
    "homePhone",
    "homePhoneExtension",
    "workPhone",
    "workPhoneExtension",
    "mobileNum",
    "email",
    "faxNum",
    "pager",
    "preferContactFlag"
})
@XmlSeeAlso({
    BillerContactsInfoType.class
})
public class ContactInfoType {

    @XmlElement(name = "PreferLang")
    protected String preferLang;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "HomePhoneExtension")
    protected String homePhoneExtension;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "WorkPhoneExtension")
    protected String workPhoneExtension;
    @XmlElement(name = "MobileNum")
    protected String mobileNum;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FaxNum")
    protected String faxNum;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "PreferContactFlag")
    @XmlSchemaType(name = "string")
    protected Boolean preferContactFlag;

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
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the homePhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneExtension() {
        return homePhoneExtension;
    }

    /**
     * Sets the value of the homePhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneExtension(String value) {
        this.homePhoneExtension = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhoneExtension(String value) {
        this.workPhoneExtension = value;
    }

    /**
     * Gets the value of the mobileNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * Sets the value of the mobileNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNum(String value) {
        this.mobileNum = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the faxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNum() {
        return faxNum;
    }

    /**
     * Sets the value of the faxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNum(String value) {
        this.faxNum = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the preferContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreferContactFlag() {
        return preferContactFlag;
    }

    /**
     * Sets the value of the preferContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferContactFlag(Boolean value) {
        this.preferContactFlag = value;
    }

}
