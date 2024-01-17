package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.entity.Student;

public interface StudentRepository extends JpaRepository<Student , Integer>
{

	
	
   
}
