package com.cogent.repo;

import com.cogent.bean.EmployeeBean;

public interface EmployeeRepo {

	void addEmployee(EmployeeBean employee);
	void viewEmployees();
	EmployeeBean findEmployee(long id);
	void deleteEmployee(long id);
	EmployeeBean findYoungest();
	void displayIndia();
	void displayIndiaAndBangalore();
}
