
package org.killbill.billing.plugin.tahseel.cxf.com.ejada;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillAction_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillAction_Type"&gt;
 *   &lt;restriction base="{http://www.ejada.com}ClosedEnum"&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillAction_Type")
@XmlEnum
public enum BillActionType {

    I,
    U,
    E;

    public String value() {
        return name();
    }

    public static BillActionType fromValue(String v) {
        return valueOf(v);
    }

}
