package com.code.dojo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.dojo.Models.Tag;
@Repository
public interface TagRepo extends CrudRepository<Tag, Long>{
	List<Tag> findAll();
	boolean existsByName(String name);
	Tag findByName(String name);
}
