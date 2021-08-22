package com.coding.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//	@RequestMapping("")
	@GetMapping("")
	public String dojoSurvey() {
		return "index.jsp";
	}
	
//	@RequestMapping("/result")
//	@RequestMapping(path="/login", method=RequestMethod.POST)
	@PostMapping("/result")
	public String result(@RequestParam("name") String username,@RequestParam("location") String location,
			@RequestParam("comment") String comment,
			@RequestParam("language") String language,Model model) {
		model.addAttribute("name", username);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		System.out.println(language);
		if(language.equals("JAVA")) {
			return "home.jsp";
		}
		return "result.jsp";
	}
	
}
