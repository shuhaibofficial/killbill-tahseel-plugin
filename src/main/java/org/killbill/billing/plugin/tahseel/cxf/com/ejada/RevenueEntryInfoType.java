
package com.ejada;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueEntryInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueEntryInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}BenAgencyId"/&gt;
 *         &lt;element ref="{http://www.ejada.com}GFSCode"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Amt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueEntryInfo_Type", propOrder = {
    "benAgencyId",
    "gfsCode",
    "amt"
})
public class RevenueEntryInfoType {

    @XmlElement(name = "BenAgencyId", required = true)
    protected String benAgencyId;
    @XmlElement(name = "GFSCode", required = true)
    protected String gfsCode;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;

    /**
     * Gets the value of the benAgencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenAgencyId() {
        return benAgencyId;
    }

    /**
     * Sets the value of the benAgencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenAgencyId(String value) {
        this.benAgencyId = value;
    }

    /**
     * Gets the value of the gfsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGFSCode() {
        return gfsCode;
    }

    /**
     * Sets the value of the gfsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGFSCode(String value) {
        this.gfsCode = value;
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

}
