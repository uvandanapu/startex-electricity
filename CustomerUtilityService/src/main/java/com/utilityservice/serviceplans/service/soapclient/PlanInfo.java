
package com.utilityservice.serviceplans.service.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planInfo", propOrder = {
    "plans",
    "sid"
})
public class PlanInfo {

    protected String plans;
    protected int sid;

    /**
     * Gets the value of the plans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlans() {
        return plans;
    }

    /**
     * Sets the value of the plans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlans(String value) {
        this.plans = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     */
    public int getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     */
    public void setSid(int value) {
        this.sid = value;
    }

}
