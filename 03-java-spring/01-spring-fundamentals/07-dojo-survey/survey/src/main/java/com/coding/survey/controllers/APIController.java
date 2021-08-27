package com.coding.survey.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coding.survey.models.Student;
import com.coding.survey.services.StudentService;

@RestController
public class APIController {
	@Autowired
	private StudentService sService;
	
//	public APIController(StudentService sService) {
//	this.sService = sService;
//}

	@GetMapping("/students")
	private Iterable<Student> getStudents() {
		return this.sService.allStudent();
	}
	
	@GetMapping("/student/{id}")
	private Student getOneStudents(@PathVariable("id") Long id) {
		return this.sService.oneStudent(id);
	}
	//create a student
	//Delete a student
}
