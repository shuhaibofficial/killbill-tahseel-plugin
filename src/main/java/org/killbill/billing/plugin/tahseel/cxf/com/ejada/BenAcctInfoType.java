
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenAcctInfo_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenAcctInfo_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.ejada.com}AcctDtls_type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ejada.com}ChapterNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}BankBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SectionId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}SequenceNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}NumOfSubDepartments" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ejada.com}NumOfSubSections" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenAcctInfo_type")
public class BenAcctInfoType
    extends AcctDtlsType
{


}
