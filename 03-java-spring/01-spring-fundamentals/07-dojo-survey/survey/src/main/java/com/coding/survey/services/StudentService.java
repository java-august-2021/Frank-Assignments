package com.coding.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.survey.models.Student;
import com.coding.survey.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

//	public StudentService(StudentRepository studentRepository) {
//		this.studentRepository = studentRepository;
//	}
	
	public Iterable <Student> allStudent(){
		return this.studentRepository.findAll();
	}
	
	public Student oneStudent(Long id){
		return this.studentRepository.findById(id).orElse(null);
	}
	
	//create a student
	public Student createStudent(Student student) {
		return this.studentRepository.save(student);
	}
	//Delete a student
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
