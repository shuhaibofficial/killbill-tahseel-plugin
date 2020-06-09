
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyId_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}PartyIdNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PartyIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyId_Type", propOrder = {
    "partyIdNum",
    "partyIdType"
})
public class PartyIdType {

    @XmlElement(name = "PartyIdNum")
    protected String partyIdNum;
    @XmlElement(name = "PartyIdType")
    protected String partyIdType;

    /**
     * Gets the value of the partyIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdNum() {
        return partyIdNum;
    }

    /**
     * Sets the value of the partyIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdNum(String value) {
        this.partyIdNum = value;
    }

    /**
     * Gets the value of the partyIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdType() {
        return partyIdType;
    }

    /**
     * Sets the value of the partyIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdType(String value) {
        this.partyIdType = value;
    }

}
