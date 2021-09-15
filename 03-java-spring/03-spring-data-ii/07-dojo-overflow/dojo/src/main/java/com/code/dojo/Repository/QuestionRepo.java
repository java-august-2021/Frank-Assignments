package com.code.dojo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.dojo.Models.Question;
import com.code.dojo.Models.Tag;
@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {
	List<Question> findAll();
//	List<Tag> listOfTagsById(Question q);
}
