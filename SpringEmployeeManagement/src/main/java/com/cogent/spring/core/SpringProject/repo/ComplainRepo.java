package com.cogent.spring.core.SpringProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.core.SpringProject.entity.Complain;

@Repository
public interface ComplainRepo extends JpaRepository<Complain, Long>{

}
