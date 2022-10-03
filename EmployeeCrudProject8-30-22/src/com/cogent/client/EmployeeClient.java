package com.cogent.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;


public class EmployeeClient {

	public static void main(String[] args){
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("************************");
			System.out.println("1. Add new Employee");
			System.out.println("2. View All Employee");
			System.out.println("3. Find employee by Id");
			System.out.println("4. Delete Employee by Id");
			System.out.println("5. Find the youngest Employee");
			System.out.println("6. Display All employee from country India");
			System.out.println("7. Display All employee from country India and city Bangalore");
			System.out.println("8. Exit Program");
			System.out.println("************************");
			
			System.out.println("Type your option");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch(input) {
			case 1:
				System.out.println("Type employee id: ");
				long id = scanner.nextLong();
				scanner.nextLine();
				System.out.println("Type employee First Name: ");
				String fname = scanner.nextLine();
				System.out.println("Type employee Last Name: ");
				String lname = scanner.nextLine();
				System.out.println("Type employee Email: ");
				String email = scanner.nextLine();
				System.out.println("Type employee age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Is the employee married? type true or false: ");
				boolean isMarried = scanner.nextBoolean();
				scanner.nextLine();
				System.out.println("Type employee City: ");
				String city = scanner.nextLine();
				System.out.println("Type employee Country: ");
				String country = scanner.nextLine();
				
				EmployeeBean employee = new EmployeeBean(id,fname,lname,email,age,isMarried,city,country);
				employeeService.addEmployee(employee);
				break;
			case 2:
				employeeService.viewEmployees();
				break;
			case 3:
				try {
					System.out.println("Type employee id to find:");
					long findId = scanner.nextLong();
					scanner.nextLine();
					employeeService.findEmployee(findId);
					break;
				} catch (InputMismatchException ime) {
					System.out.println("Type a proper input (integer)");
				}
				break;
			case 4:
				System.out.println("Type employee id to delete:");
				long deleteId = scanner.nextLong();
				scanner.nextLine();
				employeeService.deleteEmployee(deleteId);
				break;
			case 5:
				employeeService.findYoungest();
				break;
			case 6:
				employeeService.displayIndia();
				break;
			case 7:
				employeeService.displayIndiaAndBangalore(); 
				break;
			case 8:
				System.out.println("Exiting Program");
				System.exit(0);
			default:
				System.out.println("Pick a proper option...");
				break;
				
			}

		}
	}
}
