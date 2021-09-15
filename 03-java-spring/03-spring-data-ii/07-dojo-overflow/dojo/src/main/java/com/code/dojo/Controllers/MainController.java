package com.code.dojo.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.code.dojo.Models.Question;
import com.code.dojo.Services.QuestionService;
import com.code.dojo.Services.TagService;

@Controller
public class MainController {
	@Autowired
	private QuestionService qServ;
	@Autowired
	private TagService tServ;
	
	@GetMapping("")
	public String index(@ModelAttribute("newQuestion") Question question) {
		return "question.jsp";
	}
	
	@PostMapping("/create/question")
    public String createQuestion(@ModelAttribute("newQuestion") Question question, RedirectAttributes error) {
		String[] tagsToProcess = question.getTags().split(",");
		System.out.println(tagsToProcess.length);
		
		ArrayList<String> errors= new ArrayList<String>();
		
		if(tagsToProcess.length > 3) {
			errors.add("Tags can not be more than 3");
		}
		
        if(errors.size()>0) {
            for(String e : errors) {
            	error.addFlashAttribute("errors", e);
            }
            return "redirect:/";
        }
		
		Question quest=qServ.createQuestion(question);
		return "redirect:/";
	}
}
