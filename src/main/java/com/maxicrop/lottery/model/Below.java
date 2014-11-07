/**
 * 
 */
package com.maxicrop.lottery.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Apichai.T
 * 
 */
public class Below implements Serializable {

	private static final long serialVersionUID = 8857940677658057488L;
	private Integer customerId = 0;
	private Integer sheetId = 0;
	private String number = null;
	private boolean threeDigits = false;
	private boolean twoDigits = false;
	private boolean oneDigits = false;
	private Integer price = 0;
	private Date createdDate = null;
	private Date updatedDate = null;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getSheetId() {
		return sheetId;
	}

	public void setSheetId(Integer sheetId) {
		this.sheetId = sheetId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isThreeDigits() {
		return threeDigits;
	}

	public void setThreeDigits(boolean threeDigits) {
		this.threeDigits = threeDigits;
	}

	public boolean isTwoDigits() {
		return twoDigits;
	}

	public void setTwoDigits(boolean twoDigits) {
		this.twoDigits = twoDigits;
	}

	public boolean isOneDigits() {
		return oneDigits;
	}

	public void setOneDigits(boolean oneDigits) {
		this.oneDigits = oneDigits;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
