package com.ofss;

public class NewCustomer {

	
	String customerName;
	String customerLocation;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public NewCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewCustomer(String customerName, String customerLocation) {
		super();
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerLocation=" + customerLocation + "]";
	}
	
	
	
}
