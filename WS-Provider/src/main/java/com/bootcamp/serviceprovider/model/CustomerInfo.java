package com.bootcamp.serviceprovider.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "customerinfo")
public class CustomerInfo {

	@Id
	@Column(name = "id")
	private int id;

	private String fName;
	private String lName;
	private String pNum;
	private String email;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sid")
	private PlanInfo planInfo;
	
	public PlanInfo getPlanInfo() {
		return planInfo;
	}

	public void setPlanInfo(PlanInfo planInfo) {
		this.planInfo = planInfo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the pNum
	 */
	public String getpNum() {
		return pNum;
	}

	/**
	 * @param pNum
	 *            the pNum to set
	 */
	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
