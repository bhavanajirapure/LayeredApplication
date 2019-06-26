package com.demo.bo;

import java.sql.Date;

public class ProductBO {
	private int pId;
	private String pName;
	private double pCost;
	private Date mfgDate;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpCost() {
		return pCost;
	}

	public void setpCost(double pCost) {
		this.pCost = pCost;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
}
