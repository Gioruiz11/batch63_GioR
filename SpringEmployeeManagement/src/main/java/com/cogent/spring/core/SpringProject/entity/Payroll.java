package com.cogent.spring.core.SpringProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String name;
	private double amount;
	private double taxPaid;
	private int daysWorking;
	
	
	public Payroll() {
		
	}
	
	
	public Payroll(Long id, String name, double amount, double taxPaid, int daysWorking) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.taxPaid = taxPaid;
		this.daysWorking = daysWorking;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getTaxPaid() {
		return taxPaid;
	}


	public void setTaxPaid(double taxPaid) {
		this.taxPaid = taxPaid;
	}


	public int getDaysWorking() {
		return daysWorking;
	}


	public void setDaysWorking(int daysWorking) {
		this.daysWorking = daysWorking;
	}
	
	
}
