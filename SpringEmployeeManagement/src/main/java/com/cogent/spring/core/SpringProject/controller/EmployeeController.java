package com.cogent.spring.core.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.core.SpringProject.entity.Employee;
import com.cogent.spring.core.SpringProject.repo.EmployeeRepo;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	// write the logic to preform various CRUD operations ussing http methods
	// we are going to use the JPArepository to preform various operations
	// read, create, update, delete
	@Autowired
	EmployeeRepo employeeRepo;
	// creating a get mapping that revtrievs all the employee details
	@GetMapping("/getemployee") //endpoint
	private List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	
	@PostMapping("/addemployee")
	Employee newUser(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	Long deleteUser(@PathVariable Long id) {
		employeeRepo.deleteById(id);
		return id;
	}
	
}
