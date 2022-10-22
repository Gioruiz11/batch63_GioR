package com.cogent.spring.core.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.core.SpringProject.entity.Payroll;
import com.cogent.spring.core.SpringProject.repo.PayrollRepo;

@RestController
@RequestMapping("/api/payroll")			
public class PayrollController {

	@Autowired
	PayrollRepo payrollrepo;
	// creating a get mapping that revtrievs all the payroll details
	@GetMapping("/getpayroll") //endpoint
	private List<Payroll> getAllPayroll(){
		return payrollrepo.findAll();
	}
	
	
	@PostMapping("/addpayroll")
	Payroll newUser(@RequestBody Payroll payroll) {
		return payrollrepo.save(payroll);
	}
}
