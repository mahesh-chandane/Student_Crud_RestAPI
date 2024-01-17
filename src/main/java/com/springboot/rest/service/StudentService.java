package com.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.rest.entity.Student;
import com.springboot.rest.repository.StudentRepository;

@Service
public class StudentService 
{
     @Autowired
     private StudentRepository repository;
     
     public Student Add(Student student)
     {
		return repository.save(student);
    	 
     }
     public List<Student> AddAll(List<Student> students)
     {
		return repository.saveAll(students);
    	 
     }
     public Student getById(int id)
     {
		return repository.findById(id).orElse(null);
     }
     
     public List<Student> getAllStudent()
     {
		return repository.findAll();
    	 
     }
     public Student UpdateStudent(Student student)
     {
    	 Student exitingStudent=repository.findById(student.getId()).orElse(null);
    	 exitingStudent.setId(student.getId());
    	 exitingStudent.setName(student.getName());
    	 exitingStudent.setEmail(student.getEmail());
    	 exitingStudent.setCity(student.getCity());
    	 exitingStudent.setMobile(student.getMobile());
		return repository.save(exitingStudent);

     }
     public String  deleteStudent(int id)
     {
		repository.deleteById(id);;
		return "student detail delete ";
    	 
     }

}
