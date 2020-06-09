
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}RqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ProcessUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SessionId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SPRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}MsgRecDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}OverrideStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ResponseStatus"/&gt;
 *         &lt;element ref="{http://www.ejada.com}EchoData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRsHdr_Type", propOrder = {
    "rqUID",
    "processUID",
    "sessionId",
    "spRefNum",
    "msgRecDt",
    "overrideStatus",
    "responseStatus",
    "echoData"
})
public class MsgRsHdrType {

    @XmlElement(name = "RqUID")
    protected String rqUID;
    @XmlElement(name = "ProcessUID")
    protected String processUID;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "SPRefNum")
    protected String spRefNum;
    @XmlElement(name = "MsgRecDt")
    protected String msgRecDt;
    @XmlElement(name = "OverrideStatus")
    protected OverrideStatusType overrideStatus;
    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "EchoData")
    protected String echoData;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the processUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessUID() {
        return processUID;
    }

    /**
     * Sets the value of the processUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessUID(String value) {
        this.processUID = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the spRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefNum() {
        return spRefNum;
    }

    /**
     * Sets the value of the spRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefNum(String value) {
        this.spRefNum = value;
    }

    /**
     * Gets the value of the msgRecDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRecDt() {
        return msgRecDt;
    }

    /**
     * Sets the value of the msgRecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRecDt(String value) {
        this.msgRecDt = value;
    }

    /**
     * Gets the value of the overrideStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideStatusType }
     *     
     */
    public OverrideStatusType getOverrideStatus() {
        return overrideStatus;
    }

    /**
     * Sets the value of the overrideStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideStatusType }
     *     
     */
    public void setOverrideStatus(OverrideStatusType value) {
        this.overrideStatus = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the echoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoData() {
        return echoData;
    }

    /**
     * Sets the value of the echoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoData(String value) {
        this.echoData = value;
    }

}
