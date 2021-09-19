package com.code.exam.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.exam.Models.Idea;

@Repository
public interface IdeaRepo extends CrudRepository<Idea,Long> {
	List<Idea> findAll();
	List<Idea> findByOrderByNumOfLikesDesc();
	List<Idea> findByOrderByNumOfLikesAsc();
}
