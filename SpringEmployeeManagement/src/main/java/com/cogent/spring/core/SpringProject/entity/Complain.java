package com.cogent.spring.core.SpringProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complain")
public class Complain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	private String description;
	private String name;
	private String statno;
	
	public Complain() {
		
	}
	
	
	public Complain(Long id, String description, String name, String statno) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.statno = statno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatno() {
		return statno;
	}
	public void setStatno(String statno) {
		this.statno = statno;
	}
	
}
