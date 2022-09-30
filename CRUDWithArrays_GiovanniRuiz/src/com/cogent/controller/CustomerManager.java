package com.cogent.controller;

import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;

public class CustomerManager {

	public static void main(String[] args) {
		CustomerRepo cr = new CustomerRepo();
		
		Scanner s = new Scanner(System.in);
		int input;
		
		while(true) {
		System.out.println("\n");
		System.out.println("****************************");
		System.out.println("CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("****************************");
		System.out.println("1. Add Customer");
		System.out.println("2. View All Customers");
		System.out.println("3. Search Customer by id");
		System.out.println("4. Exit");
		
		input = s.nextInt();
		
		switch(input) {
		case 1:
			String end = "";
			do {
			System.out.println("User selected 1");
			System.out.println("Please enter customer ID");
			
			int customerID = s.nextInt(); 
			s.nextLine(); // fixes nextline bug
			
			System.out.println("Please enter customer name");
			
			String customerName = s.nextLine();
			CustomerBean newCustomer = new CustomerBean(customerID, customerName);
			cr.addCustomer(newCustomer);

			System.out.println("Customer added successfully.");
			System.out.println("Do you want to add more customers? Type Y or N.");
			
			end = s.nextLine();
			} while(end.equals("Y"));
			break;
			
		case 2:
			System.out.println("User selected 2");
			System.out.println("Press N to exit and Y to back to Main Menu\n");
			cr.viewAllCustomer();
			break;
			
		case 3:
			System.out.println("User selected 3");
			System.out.println("Enter the customer id");
			int customerID2 = s.nextInt();
			CustomerBean search = cr.searchCustomerByID(customerID2);
			if(search == null) {
				System.out.println("Customer doesnt exist");
			}
			System.out.println("Press Y to search more and press N to go to main menu\n");
			break;
			
		case 4:
			System.exit(0);
			break;
			
		default:
			System.out.println("Type a correct option...");
			break;
			
		}
		

	
	}
	}

}

