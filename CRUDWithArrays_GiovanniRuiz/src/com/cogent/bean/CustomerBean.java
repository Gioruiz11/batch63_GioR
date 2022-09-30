package com.cogent.bean;

import java.io.Serializable;

public class CustomerBean implements Serializable {
	private long customerID;
	private String customerName;
	
	public CustomerBean(long customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public long getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
