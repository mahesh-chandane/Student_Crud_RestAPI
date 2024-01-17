package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entity.Student;
import com.springboot.rest.service.StudentService;

import jakarta.persistence.PostLoad;

@RestController
public class StudentController {

	@Autowired 
	private StudentService service;
	
	@PostMapping("/save")
	public Student SaveStudent(@RequestBody Student student)
	{
		return service.Add(student);
		
	}
	@PostMapping("/saveAll")
	public List<Student> SaveAllStudent(@RequestBody List<Student> students)
	{
		return service.AddAll(students);
		
	}
	@GetMapping("/fetch")
	public List<Student> fetchStudent()
	{
		return service.getAllStudent();
		
	}
	@GetMapping("/fetch/{id}")
	public Student fetchStudentById(@PathVariable int id)
	{
		return service.getById(id);
		
	}
	@PutMapping("/update")
	public Student updateStudentData(@RequestBody  Student student)
	{
		return service.UpdateStudent(student);
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return service.deleteStudent(id);
		
	}
	
	
}
