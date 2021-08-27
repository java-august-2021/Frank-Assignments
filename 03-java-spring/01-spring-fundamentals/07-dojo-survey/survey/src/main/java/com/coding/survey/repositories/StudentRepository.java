package com.coding.survey.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.survey.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student , Long>{
	//  (CrudRepository class) create ,read ,update and delete
	
//	 List<Student> findAll();
	
}
