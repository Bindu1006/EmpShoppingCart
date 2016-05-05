package com.sjsu.ad.BO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customers")
public class CustomerInfoBO {
	
	@Id
	@Column(name = "customerUsername", nullable = false)
	private String customerUsername;
	
	@Column(name = "customerPassword", nullable = false)
	private String customerPassword;
	
	@Column(name = "customerLastName", nullable = false)
	private String customerLastName;
	
	@Column(name = "customerFirstName", nullable = false)
	private String customerFirstName;
	
	@Column(name = "customerEmail", nullable = false)
	private String customerEmail;
	
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "postalCode", nullable = true)
	private String postalCode;
	
	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "country", nullable = false)
	private String country;

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CustomerInfoBO [customerUsername=" + customerUsername
				+ ", customerPassword=" + customerPassword
				+ ", customerLastName=" + customerLastName
				+ ", customerFirstName=" + customerFirstName
				+ ", customerEmail=" + customerEmail + ", phone=" + phone
				+ ", address=" + address + ", city=" + city + ", postalCode="
				+ postalCode + ", state=" + state + ", country=" + country
				+ "]";
	}

}
