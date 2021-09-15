package com.code.dojo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.dojo.Models.Answer;
@Repository
public interface AnswerRepo extends CrudRepository<Answer,Long>{
	List<Answer> findAll();
}
