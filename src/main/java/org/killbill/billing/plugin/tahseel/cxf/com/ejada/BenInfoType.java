
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}BenPOI" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BenName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenInfo_Type", propOrder = {
    "benPOI",
    "benName"
})
public class BenInfoType {

    @XmlElement(name = "BenPOI")
    protected POIType benPOI;
    @XmlElement(name = "BenName")
    protected String benName;

    /**
     * Gets the value of the benPOI property.
     * 
     * @return
     *     possible object is
     *     {@link POIType }
     *     
     */
    public POIType getBenPOI() {
        return benPOI;
    }

    /**
     * Sets the value of the benPOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIType }
     *     
     */
    public void setBenPOI(POIType value) {
        this.benPOI = value;
    }

    /**
     * Gets the value of the benName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenName() {
        return benName;
    }

    /**
     * Sets the value of the benName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenName(String value) {
        this.benName = value;
    }

}
