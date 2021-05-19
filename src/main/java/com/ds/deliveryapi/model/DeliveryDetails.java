package com.ds.deliveryapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Delivery")
public class DeliveryDetails {
	
	private String customerName;
	private String homeNo;
	private String addressLine;
	private String city;
	private String provice;
	private String postalCode;
	
	public DeliveryDetails() {
		super();
	}

	public DeliveryDetails(String customerName, String homeNo, String addressLine, String city, String provice, String postalCode) {
		super();
		this.customerName = customerName;
		this.homeNo = homeNo;
		this.addressLine = addressLine;
		this.city = city;
		this.provice = provice;
		this.postalCode = postalCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}
	
	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
