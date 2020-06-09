
package com.ejada;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtOptions_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtOptions_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}MinPartialPmtAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}MinAdvancePmtAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}MaxAdvancePmtAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtOptions_Type", propOrder = {
    "minPartialPmtAmt",
    "minAdvancePmtAmt",
    "maxAdvancePmtAmt"
})
public class PmtOptionsType {

    @XmlElement(name = "MinPartialPmtAmt")
    protected BigDecimal minPartialPmtAmt;
    @XmlElement(name = "MinAdvancePmtAmt")
    protected BigDecimal minAdvancePmtAmt;
    @XmlElement(name = "MaxAdvancePmtAmt")
    protected BigDecimal maxAdvancePmtAmt;

    /**
     * Gets the value of the minPartialPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPartialPmtAmt() {
        return minPartialPmtAmt;
    }

    /**
     * Sets the value of the minPartialPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPartialPmtAmt(BigDecimal value) {
        this.minPartialPmtAmt = value;
    }

    /**
     * Gets the value of the minAdvancePmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAdvancePmtAmt() {
        return minAdvancePmtAmt;
    }

    /**
     * Sets the value of the minAdvancePmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAdvancePmtAmt(BigDecimal value) {
        this.minAdvancePmtAmt = value;
    }

    /**
     * Gets the value of the maxAdvancePmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAdvancePmtAmt() {
        return maxAdvancePmtAmt;
    }

    /**
     * Sets the value of the maxAdvancePmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAdvancePmtAmt(BigDecimal value) {
        this.maxAdvancePmtAmt = value;
    }

}
