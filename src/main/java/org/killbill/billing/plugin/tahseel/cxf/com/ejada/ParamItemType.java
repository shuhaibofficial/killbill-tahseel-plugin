
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamItem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamItem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}ParamCd"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ParamVal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamItem_Type", propOrder = {
    "paramCd",
    "paramVal"
})
public class ParamItemType {

    @XmlElement(name = "ParamCd", required = true)
    protected String paramCd;
    @XmlElement(name = "ParamVal", required = true)
    protected String paramVal;

    /**
     * Gets the value of the paramCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamCd() {
        return paramCd;
    }

    /**
     * Sets the value of the paramCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamCd(String value) {
        this.paramCd = value;
    }

    /**
     * Gets the value of the paramVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamVal() {
        return paramVal;
    }

    /**
     * Sets the value of the paramVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamVal(String value) {
        this.paramVal = value;
    }

}
