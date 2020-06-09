
package com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.ejada.com}BillRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgencyId" type="{http://www.ejada.com}TahseelAgencyId_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillingAcct"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillCycle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}Amt"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillAction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}ActionReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DisplayLabelAr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}DisplayLabelEn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillDueDt"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillExpiryDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BillRefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}PmtOptions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BenInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}RevenueEntryList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BenAcctInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillInfo_Type")
public class BillInfoType
    extends BillRecType
{


}
