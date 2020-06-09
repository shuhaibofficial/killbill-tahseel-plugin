
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillManageRqBody_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillManageRqBody_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}BatchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillManageRqBody_Type", propOrder = {
    "batchId",
    "billList"
})
public class BillManageRqBodyType {

    @XmlElement(name = "BatchId")
    protected String batchId;
    @XmlElement(name = "BillList", required = true)
    protected BillListType billList;

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the billList property.
     * 
     * @return
     *     possible object is
     *     {@link BillListType }
     *     
     */
    public BillListType getBillList() {
        return billList;
    }

    /**
     * Sets the value of the billList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillListType }
     *     
     */
    public void setBillList(BillListType value) {
        this.billList = value;
    }

}
