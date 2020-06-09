
package com.ejada;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillSummInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillSummInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DescAr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DescEn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillSummInfo_Type", propOrder = {
    "amt",
    "descAr",
    "descEn"
})
public class BillSummInfoType {

    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "DescAr")
    protected String descAr;
    @XmlElement(name = "DescEn")
    protected String descEn;

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
     * Gets the value of the descAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAr() {
        return descAr;
    }

    /**
     * Sets the value of the descAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAr(String value) {
        this.descAr = value;
    }

    /**
     * Gets the value of the descEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEn() {
        return descEn;
    }

    /**
     * Sets the value of the descEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEn(String value) {
        this.descEn = value;
    }

}
