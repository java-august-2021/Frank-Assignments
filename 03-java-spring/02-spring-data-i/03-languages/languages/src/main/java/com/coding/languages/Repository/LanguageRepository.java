package com.coding.languages.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.languages.Models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

	List<Language> findAll();
}
