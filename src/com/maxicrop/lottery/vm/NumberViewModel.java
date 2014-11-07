/**
 * 
 */
package com.maxicrop.lottery.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.zkoss.bind.annotation.Init;

import com.maxicrop.lottery.model.Above;
import com.maxicrop.lottery.model.Below;

/**
 * @author Apichai.T
 * 
 */
public class NumberViewModel {
	
	protected String keyword;
	protected List<Above> threeUpList = null;
	protected List<Below> threeDownList = null;
	protected List<Above> twoUpList = null;
	protected List<Below> twoDownList = null;
	protected List<Above> oneUpList = null;
	protected List<Below> oneDownList = null;
	protected Above selectedNumber;

	@Init
	public void init() {
		threeUpList = new ArrayList<Above>();
		threeDownList = new ArrayList<Below>();
		twoUpList = new ArrayList<Above>();
		twoDownList = new ArrayList<Below>();
		oneUpList = new ArrayList<Above>();
		oneDownList = new ArrayList<Below>();
		Random rand = new Random();
		
		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(999);
			Above a = new Above();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setThreeDigits(true);
			a.setNumber(String.format("%03d", n));
			a.setPriceDirect(i * 100);
			a.setPriceCommutative(i * 150);
			threeUpList.add(a);
		}

		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(99);
			Above a = new Above();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setTwoDigits(true);
			a.setNumber(String.format("%02d", n));
			a.setPriceDirect(i * 100);
			twoUpList.add(a);
		}

		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(10);
			Above a = new Above();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setOneDigits(true);
			a.setNumber(String.format("%01d", n));
			a.setPriceDirect(i * 100);
			oneUpList.add(a);
		}

		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(999);
			Below a = new Below();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setThreeDigits(true);
			a.setNumber(String.format("%03d", n));
			a.setPrice(i * 100);
			threeDownList.add(a);
		}

		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(99);
			Below a = new Below();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setTwoDigits(true);
			a.setNumber(String.format("%02d", n));
			a.setPrice(i * 100);
			twoDownList.add(a);
		}

		for (int i = 1; i <= 100; i++) {
			int n = rand.nextInt(10);
			Below a = new Below();
			a.setCustomerId(1);
			a.setSheetId(1);
			a.setOneDigits(true);
			a.setNumber(String.format("%01d", n));
			a.setPrice(i * 100);
			oneDownList.add(a);
		}

	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Above> getThreeUpList() {
		return threeUpList;
	}

	public void setThreeUpList(List<Above> threeUpList) {
		this.threeUpList = threeUpList;
	}

	public List<Below> getThreeDownList() {
		return threeDownList;
	}

	public void setThreeDownList(List<Below> threeDownList) {
		this.threeDownList = threeDownList;
	}

	public List<Above> getTwoUpList() {
		return twoUpList;
	}

	public void setTwoUpList(List<Above> twoUpList) {
		this.twoUpList = twoUpList;
	}

	public List<Below> getTwoDownList() {
		return twoDownList;
	}

	public void setTwoDownList(List<Below> twoDownList) {
		this.twoDownList = twoDownList;
	}

	public List<Above> getOneUpList() {
		return oneUpList;
	}

	public void setOneUpList(List<Above> oneUpList) {
		this.oneUpList = oneUpList;
	}

	public List<Below> getOneDownList() {
		return oneDownList;
	}

	public void setOneDownList(List<Below> oneDownList) {
		this.oneDownList = oneDownList;
	}

	public Above getSelectedNumber() {
		return selectedNumber;
	}

	public void setSelectedNumber(Above selectedNumber) {
		this.selectedNumber = selectedNumber;
	}

}
