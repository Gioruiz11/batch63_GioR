package com.cogent.spring.core.SpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.core.SpringProject.entity.Complain;
import com.cogent.spring.core.SpringProject.repo.ComplainRepo;

@RestController
@RequestMapping("api/complain")
public class ComplainController {

	@Autowired
	ComplainRepo complainRepo;
	// creating a get mapping that revtrievs all the employee details
	@GetMapping("/getcomplain") //endpoint
	private List<Complain> getAllComplaints(){
		return complainRepo.findAll();
	}
	
	
	@PostMapping("/addcomplain")
	Complain newUser(@RequestBody Complain complain) {
		return complainRepo.save(complain);
	}
}
