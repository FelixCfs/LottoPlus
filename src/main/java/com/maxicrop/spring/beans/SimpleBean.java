/**
 * 
 */
package com.maxicrop.spring.beans;

import org.springframework.context.annotation.Scope;

/**
 * @author Apichai.T
 * 
 */
@org.springframework.stereotype.Component("simpleBean")
public class SimpleBean {

	private String message = "Test SimpleBean";

	public SimpleBean() {
	}

	public SimpleBean(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
