package com.maxicrop.lottery.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -1925363806288044527L;
	private Integer customerId = 0;
	private String customerName = null;
	private String customerTel = null;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerTel() {
		return customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

}
