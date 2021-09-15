package com.code.dojo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dojo.Models.Question;
import com.code.dojo.Models.Tag;
import com.code.dojo.Repository.QuestionRepo;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepo qRepo;
	

	@Autowired
	private TagService tServ;

	// Find a List Of Question
	public List<Question> allQuestion() {
		return qRepo.findAll();
	}

	// Find Tag for Specific Question
//	public List<Tag> listOfTagsById(Question q){
//		return qRepo.listOfTagsById(q);
//	}

	// Find one Question By ID
	public Question oneQuestionById(Long Id) {
		return qRepo.findById(Id).orElse(null);
	}

	// create a question
	public Question createQuestion(Question q) {
		List<Tag> tagForQuestion = new ArrayList<Tag>();
		String[] tagsToProcess = q.getTags().split(",");
		for (String S : tagsToProcess) {
			// Check if Tag exist
			if(tServ.existsByName(S)) {
				Tag addTag = tServ.findByName(S);
				tagForQuestion.add(addTag);


			}
			else {
				Tag newTag = new Tag();
				newTag.setName(S.toLowerCase());
				tServ.createTag(newTag);
				// Debugg purpose System.out.println(newTag.getName());
				tagForQuestion.add(newTag);

			}

		}
		q.setTagList(tagForQuestion);
		return qRepo.save(q);
	}

}
