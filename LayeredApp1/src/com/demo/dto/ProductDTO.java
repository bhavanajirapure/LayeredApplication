package com.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductDTO implements Serializable {
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

	public java.sql.Date getMfgDate() {
		return new java.sql.Date(mfgDate.getTime());
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

}
