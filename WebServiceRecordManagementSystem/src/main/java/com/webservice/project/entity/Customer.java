package com.webservice.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	
	@NotNull private String customerName;
	@NotNull private String customerGender;
	@NotNull private String customerIdCardNumber;
	@NotNull private int customerAge;
	@NotNull private String customerVehicle;
	private String customerEmail;
	
	public Customer() {
		
	}
	public Customer(int customerID, String customerName, String customerGender, String customerIdCardNumber,
			int customerAge, String customerVehicle, String customerEmail) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGender = customerGender;
		this.customerIdCardNumber = customerIdCardNumber;
		this.customerAge = customerAge;
		this.customerVehicle = customerVehicle;
		this.customerEmail = customerEmail;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerIdCardNumber() {
		return customerIdCardNumber;
	}
	public void setCustomerIdCardNumber(String customerIdCardNumber) {
		this.customerIdCardNumber = customerIdCardNumber;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerVehicle() {
		return customerVehicle;
	}
	public void setCustomerVehicle(String customerVehicle) {
		this.customerVehicle = customerVehicle;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGender="
				+ customerGender + ", customerIdCardNumber=" + customerIdCardNumber + ", customerAge=" + customerAge
				+ ", customerVehicle=" + customerVehicle + ", customerEmail=" + customerEmail + "]";
	}

}
