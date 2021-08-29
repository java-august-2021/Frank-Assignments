package com.coding.languages.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding.languages.Models.Language;
import com.coding.languages.Repository.LanguageRepository;
@Service
public class LanguageService {
private LanguageRepository languageRepo;

public LanguageService(LanguageRepository languageRepo) {
	this.languageRepo = languageRepo;
}
public List<Language> allLanguage() {
    return languageRepo.findAll();
}

public Language createLanguage(Language language) {
    return languageRepo.save(language);
}

public void delete(Long id) {
     languageRepo.deleteById(id);
}

public Language findLanguage(Long id) {
	Optional <Language> optionLanguage=languageRepo.findById(id);
	if(optionLanguage.isPresent()) {
		return optionLanguage.get();
	}
	else {
		return null;
	}
}
 public Language updateLang(Language language) {
	 return languageRepo.save(language);
 }

}
