package com.mypoc.model;

/**
 * 
 * @author Krishna
 *
 */
public class Address {
	private String house;
	private String street;
	private String postalCode;
	private String City;
	private String county;
	private String state;
	private String stateCode;
	private String country;
	private String countryCode;
	
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Override
	public String toString() {
		return "Address [house=" + house + ", street=" + street + ", postalCode=" + postalCode + ", City=" + City
				+ ", county=" + county + ", state=" + state + ", stateCode=" + stateCode + ", country=" + country
				+ ", countryCode=" + countryCode + "]";
	}
}
