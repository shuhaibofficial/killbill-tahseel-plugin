
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}FullNameAr"/&gt;
 *         &lt;element ref="{http://www.ejada.com}POINum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}POIType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfo_Type", propOrder = {
    "fullName",
    "fullNameAr",
    "poiNum",
    "poiType"
})
public class CustomerInfoType {

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "FullNameAr", required = true)
    protected String fullNameAr;
    @XmlElement(name = "POINum")
    protected String poiNum;
    @XmlElement(name = "POIType")
    protected String poiType;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the fullNameAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameAr() {
        return fullNameAr;
    }

    /**
     * Sets the value of the fullNameAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameAr(String value) {
        this.fullNameAr = value;
    }

    /**
     * Gets the value of the poiNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOINum() {
        return poiNum;
    }

    /**
     * Sets the value of the poiNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOINum(String value) {
        this.poiNum = value;
    }

    /**
     * Gets the value of the poiType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIType() {
        return poiType;
    }

    /**
     * Sets the value of the poiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIType(String value) {
        this.poiType = value;
    }

}
