package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

public class EmployeeRepoImpl implements EmployeeRepo {

	List<EmployeeBean> employeeList = new ArrayList<>();
	
	
	@Override
	public void addEmployee(EmployeeBean employee) {
		employeeList.add(employee);
		
	}

	@Override
	public void viewEmployees() {
		for(EmployeeBean employee : employeeList) {
			System.out.println("Id: " + employee.getEmployeeId() + "\nFirst Name: " + employee.getEmployeeFname()
			+ "\nLast Name: " + employee.getEmployeeLname() + "\nEmail: " + employee.getEmployeeEmail() + "\nAge: " + employee.getEmployeeAge()
			+ "\nIsMarried: " + employee.isEmployeeIsMarried() + "\nCity: " + employee.getEmployeeCity() + "\nCountry: " + employee.getEmployeeCountry() + "\n");
		}
		
	}

	@Override
	public EmployeeBean findEmployee(long id) {
		for(EmployeeBean employee : employeeList) {
			if(employee.getEmployeeId() == id) {
				System.out.println("Id: " + employee.getEmployeeId() + "\nFirst Name: " + employee.getEmployeeFname()
				+ "\nLast Name: " + employee.getEmployeeLname() + "\nEmail: " + employee.getEmployeeEmail() + "\nAge: " + employee.getEmployeeAge()
				+ "\nIsMarried: " + employee.isEmployeeIsMarried() + "\nCity: " + employee.getEmployeeCity() + "\nCountry: " + employee.getEmployeeCountry() + "\n");
				return employee;
			}
		}
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		for(int i = 0; i < employeeList.size(); i++) {
			if(employeeList.get(i).getEmployeeId() == id) {
				employeeList.remove(i);
			}
		}
		
	}

	@Override
	public EmployeeBean findYoungest() {
		EmployeeBean youngestEmployee = null;
		int youngest = Integer.MAX_VALUE;
		
		for(EmployeeBean employeeBean : employeeList) {
			if(employeeBean.getEmployeeAge() < youngest) {
				youngest = employeeBean.getEmployeeAge();
				youngestEmployee = employeeBean;
			}
		}
		System.out.println("Id: " + youngestEmployee.getEmployeeId() + "\nFirst Name: " + youngestEmployee.getEmployeeFname()
		+ "\nLast Name: " + youngestEmployee.getEmployeeLname() + "\nEmail: " + youngestEmployee.getEmployeeEmail() + "\nAge: " + youngestEmployee.getEmployeeAge()
		+ "\nIsMarried: " + youngestEmployee.isEmployeeIsMarried() + "\nCity: " + youngestEmployee.getEmployeeCity() + "\nCountry: " + youngestEmployee.getEmployeeCountry() + "\n");
		return youngestEmployee;
	}

	@Override
	public void displayIndia() {
		for(EmployeeBean employee : employeeList) {
			if(employee.getEmployeeCountry().equals("India")) {
				System.out.println("Id: " + employee.getEmployeeId() + "\nFirst Name: " + employee.getEmployeeFname()
				+ "\nLast Name: " + employee.getEmployeeLname() + "\nEmail: " + employee.getEmployeeEmail() + "\nAge: " + employee.getEmployeeAge()
				+ "\nIsMarried: " + employee.isEmployeeIsMarried() + "\nCity: " + employee.getEmployeeCity() + "\nCountry: " + employee.getEmployeeCountry() + "\n");
			}
		}
		
	}

	@Override
	public void displayIndiaAndBangalore() {
		for(EmployeeBean employee : employeeList) {
			if(employee.getEmployeeCountry().equals("India") && employee.getEmployeeCity().equals("Bangalore")) {
				System.out.println("Id: " + employee.getEmployeeId() + "\nFirst Name: " + employee.getEmployeeFname()
				+ "\nLast Name: " + employee.getEmployeeLname() + "\nEmail: " + employee.getEmployeeEmail() + "\nAge: " + employee.getEmployeeAge()
				+ "\nIsMarried: " + employee.isEmployeeIsMarried() + "\nCity: " + employee.getEmployeeCity() + "\nCountry: " + employee.getEmployeeCountry() + "\n");
			}
		}
		
	}

}
