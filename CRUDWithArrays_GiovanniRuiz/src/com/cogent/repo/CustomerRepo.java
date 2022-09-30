package com.cogent.repo;

import com.cogent.bean.CustomerBean;

public class CustomerRepo {
	CustomerBean[] arr = new CustomerBean[6];
	
	
	public void addCustomer(CustomerBean customerBean) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = customerBean;
				return;
			}
		}
	}
	
	public CustomerBean[] viewAllCustomer(){
		System.out.println("Customer ID   Customer Name");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.println("     " + arr[i].getCustomerID() + " "
						+ "       " + arr[i].getCustomerName());
			}
		}
		return arr;
	}
	
	public CustomerBean searchCustomerByID(long id) {
		System.out.println("Customer ID   Customer Name");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getCustomerID() == id) {
				System.out.println("     " + arr[i].getCustomerID() + " "
						+ "       " + arr[i].getCustomerName());
				return arr[i];
			}
		}
		return null;
	}
}
