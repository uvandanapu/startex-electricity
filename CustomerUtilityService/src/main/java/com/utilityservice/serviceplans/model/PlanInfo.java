package com.utilityservice.serviceplans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serviceplans")
/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceplans", propOrder = { "sid", "plans" })*/
public class PlanInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	private String plans;

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the plans
	 */
	public String getPlans() {
		return plans;
	}

	/**
	 * @param planss
	 *            the plans to set
	 */
	public void setPlans(String servicePlans) {
		this.plans = servicePlans;
	}

}
