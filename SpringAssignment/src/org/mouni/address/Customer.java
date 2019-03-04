package org.mouni.address;

public class Customer {
	private int customerid;
	private String customername;
	private long customercontact;
	private Address customeraddress;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomercontact() {
		return customercontact;
	}
	public void setCustomercontact(long customercontact) {
		this.customercontact = customercontact;
	}
	public Address getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(Address customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customercontact="
				+ customercontact + ", customerAddress=" + customeraddress + "]";
	}
	
	
}
