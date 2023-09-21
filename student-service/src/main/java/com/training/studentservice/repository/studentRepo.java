package com.training.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.studentservice.model.Student;

public interface studentRepo extends JpaRepository<Student, Long>{
	

}
