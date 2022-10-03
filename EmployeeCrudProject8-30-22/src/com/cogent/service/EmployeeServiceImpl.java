package com.cogent.service;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	// sends info to EmployeeRepo
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
	
	@Override
	public void addEmployee(EmployeeBean employeeBean) {
		employeeRepo.addEmployee(employeeBean);
	}

	@Override
	public void viewEmployees() {
		employeeRepo.viewEmployees();
		
	}

	@Override
	public EmployeeBean findEmployee(long id) {
		return employeeRepo.findEmployee(id);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepo.deleteEmployee(id);
		
	}

	@Override
	public EmployeeBean findYoungest() {
		return employeeRepo.findYoungest();
	}

	@Override
	public void displayIndia() {
		employeeRepo.displayIndia();
		
	}

	@Override
	public void displayIndiaAndBangalore() {
		employeeRepo.displayIndiaAndBangalore();
		
	}

}
