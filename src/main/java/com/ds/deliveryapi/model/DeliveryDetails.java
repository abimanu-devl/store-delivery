package com.ds.deliveryapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Delivery")
public class DeliveryDetails {
	
	@Id
	private int deliveryId;
	private String customerName;
	private String contactNumber;
	private String homeNo;
	private String city;
	private String provice;
	private String postalCode;
	
	public DeliveryDetails() {
		super();
	}

	public DeliveryDetails(int deliveryId, String customerName, String contactNumber, String homeNo, String city,
			String provice, String postalCode) {
		super();
		this.deliveryId = deliveryId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.homeNo = homeNo;
		this.city = city;
		this.provice = provice;
		this.postalCode = postalCode;
	}

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
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
