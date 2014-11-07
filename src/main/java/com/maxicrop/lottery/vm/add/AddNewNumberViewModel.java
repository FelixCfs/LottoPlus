/**
 * 
 */
package com.maxicrop.lottery.vm.add;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import com.maxicrop.lottery.model.Customer;
import com.maxicrop.lottery.vm.NumberViewModel;

/**
 * @author Apichai.T
 * 
 */
public class AddNewNumberViewModel extends NumberViewModel {

	public Customer customer = null;
	public List<Customer> customers = null;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Init(superclass = true)
	public void newNumberInit() {
		customer = new Customer();
		customers = new ArrayList<Customer>();
	}

	@NotifyChange({"customer","customers"})
	@Command("addCustomerBTN")
	public void addCustomerBTN() {
		customers.add(customer);
		customer = new Customer();
	}
}
