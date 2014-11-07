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
public class Above implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1534707380422156108L;
	private Integer customerId = 0;
	private Integer sheetId = 0;
	private String number = null;
	private boolean threeDigits = false;
	private boolean twoDigits = false;
	private boolean oneDigits = false;
	private Integer priceDirect = 0;
	private Integer priceCommutative = 0;
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

	public Integer getPriceDirect() {
		return priceDirect;
	}

	public void setPriceDirect(Integer priceDirect) {
		this.priceDirect = priceDirect;
	}

	public Integer getPriceCommutative() {
		return priceCommutative;
	}

	public void setPriceCommutative(Integer priceCommutative) {
		this.priceCommutative = priceCommutative;
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