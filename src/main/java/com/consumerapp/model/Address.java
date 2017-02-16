package com.consumerapp.model;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1999296464121180567L;
	
	private String street;
	private String house;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String street, String house, String landmark, String city, String state, String pincode) {
		super();
		this.street = street;
		this.house = house;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
