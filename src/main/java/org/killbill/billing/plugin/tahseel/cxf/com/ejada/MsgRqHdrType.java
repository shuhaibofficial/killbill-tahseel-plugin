
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}RqUID"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ProcessUID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SessionId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SCId"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ServiceId"/&gt;
 *         &lt;element ref="{http://www.ejada.com}FuncId"/&gt;
 *         &lt;element ref="{http://www.ejada.com}RqMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}UserId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ProxyUserId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ClientDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}EchoData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Version" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr_Type", propOrder = {
    "rqUID",
    "processUID",
    "sessionId",
    "scId",
    "serviceId",
    "funcId",
    "rqMode",
    "partyId",
    "userId",
    "proxyUserId",
    "clientDt",
    "echoData",
    "version"
})
public class MsgRqHdrType {

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "ProcessUID")
    protected String processUID;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "SCId", required = true)
    protected String scId;
    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "FuncId", required = true)
    protected String funcId;
    @XmlElement(name = "RqMode")
    protected Long rqMode;
    @XmlElement(name = "PartyId")
    protected PartyIdType partyId;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "ProxyUserId")
    protected String proxyUserId;
    @XmlElement(name = "ClientDt")
    protected String clientDt;
    @XmlElement(name = "EchoData")
    protected String echoData;
    @XmlElement(name = "Version")
    protected String version;

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
     * Gets the value of the scId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCId() {
        return scId;
    }

    /**
     * Sets the value of the scId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCId(String value) {
        this.scId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the funcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * Sets the value of the funcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncId(String value) {
        this.funcId = value;
    }

    /**
     * Gets the value of the rqMode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRqMode() {
        return rqMode;
    }

    /**
     * Sets the value of the rqMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRqMode(Long value) {
        this.rqMode = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdType }
     *     
     */
    public PartyIdType getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdType }
     *     
     */
    public void setPartyId(PartyIdType value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the proxyUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyUserId() {
        return proxyUserId;
    }

    /**
     * Sets the value of the proxyUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyUserId(String value) {
        this.proxyUserId = value;
    }

    /**
     * Gets the value of the clientDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDt(String value) {
        this.clientDt = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
