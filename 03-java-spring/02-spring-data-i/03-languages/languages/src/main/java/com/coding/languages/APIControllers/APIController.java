package com.coding.languages.APIControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.languages.Models.Language;
import com.coding.languages.Services.LanguageService;

@Controller
public class APIController {
@Autowired
private LanguageService langServ;

//public APIController(LanguageService langServ) {
//	this.langServ = langServ;
//}

@GetMapping("/languages")
public String dashboard(@ModelAttribute("language")Language language, Model viewModel) {
	List <Language> lang=langServ.allLanguage();
	viewModel.addAttribute("allLanguage", lang);
	return"index.jsp";
}

@PostMapping("/languages")
public String create(@Valid @ModelAttribute("language")Language language, BindingResult result, Model viewModel) { 
	List <Language> lang=langServ.allLanguage();

	if(result.hasErrors()) {
		viewModel.addAttribute("allLanguage", lang);
		return "index.jsp";
	}
	langServ.createLanguage(language);
	return "redirect:/languages";
}

@GetMapping("/delete/{id}")
public String delete(@PathVariable("id") Long id) {
	langServ.delete(id);
	return "redirect:/languages";
}

@GetMapping("/languages/edit/{id}")
public String edit(@PathVariable("id") Long id ,Model viewModel) {
	Language languageId=langServ.findLanguage(id);
	viewModel.addAttribute("language", languageId);
	return "edit.jsp";
}

@PostMapping("/languages/{id}/update")
public String update(@Valid @ModelAttribute("language")Language language, BindingResult result){
	if(result.hasErrors()) {
		return "edit.jsp";
	}
	langServ.updateLang(language);
	return "redirect:/languages";
}

@GetMapping("/languages/{id}")
public String oneLanguage(@PathVariable("id") Long id ,Model viewModel) {
	Language languageId=langServ.findLanguage(id);
	viewModel.addAttribute("language", languageId);
	return "show.jsp";
}

}
