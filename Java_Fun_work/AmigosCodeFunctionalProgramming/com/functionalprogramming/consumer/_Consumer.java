package com.functionalprogramming.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	static class Customer{
		private final String customerName;
		private final String custmerPhoneNumber;	
		public Customer(String customerName, String custmerPhoneNumber) {
			this.customerName = customerName;
			this.custmerPhoneNumber = custmerPhoneNumber;
		}
		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", custmerPhoneNumber=" + custmerPhoneNumber + "]";
		}		
	}
	
	public static void main(String[] args) {
		
		//Customer
		Customer saqib = new Customer("Saqib" , "03249763046"); 
		//Normal Java Function
		greetCustomer(saqib);
		
		//Consumer Java Function
		greetCustomerConsumer.accept(saqib);
		
		//Consumer Java Function V2
		greetCustomerConsumerV2.accept(saqib , false);
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer ->
		System.out.println("Hello " + customer.customerName + ", thanks for registering"
			+ " phone number " + customer.custmerPhoneNumber);
	
	static BiConsumer<Customer , Boolean> greetCustomerConsumerV2 = (customer , showPhoneNumber )->
		System.out.println("Hello " + customer.customerName + ", thanks for registering"
			+ " phone number " +
				(showPhoneNumber ?  customer.custmerPhoneNumber : "***********"));

	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + ", thanks for registering"
				+ " phone number " + customer.custmerPhoneNumber);
	}
	
	

}
