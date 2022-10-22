package com.cogent.spring.core.SpringProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.core.SpringProject.entity.Payroll;
@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long>{

}
