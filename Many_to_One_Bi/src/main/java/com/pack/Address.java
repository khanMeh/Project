package com.pack;

import java.util.HashSet;
import java.util.Set;

public class Address {

	private Long addressId;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private Set<Student>  people;
   	
	public Address() {
	}

	

	public Long getAddressId() {
		
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}



	public Set<Student> getPeople() {
		return people;
	}



	public void setPeople(Set<Student> people) {
		this.people = people;
	}



	

	
	 
}
