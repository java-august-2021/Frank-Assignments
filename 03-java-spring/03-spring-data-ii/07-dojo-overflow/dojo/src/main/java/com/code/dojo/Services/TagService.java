package com.code.dojo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dojo.Models.Question;
import com.code.dojo.Models.Tag;
import com.code.dojo.Repository.TagRepo;

@Service
public class TagService {
	@Autowired
	private TagRepo tRepo;
	
	public List<Tag> allTags(){
		return tRepo.findAll();
	}
	
	// Find one Tag By ID
	public Tag oneTagById(Long Id) {
		return tRepo.findById(Id).orElse(null);
	}
	
	public Tag findByName(String name) {
		return tRepo.findByName(name);
	}
	
	public Tag createTag(Tag t) {
		return tRepo.save(t);
	}
	
	public boolean existsByName(String name){
		return tRepo.existsByName(name);
	}
	
	
	
}
