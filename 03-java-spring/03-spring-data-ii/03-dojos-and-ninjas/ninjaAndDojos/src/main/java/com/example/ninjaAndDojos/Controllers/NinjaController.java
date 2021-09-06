package com.example.ninjaAndDojos.Controllers;

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

import com.example.ninjaAndDojos.Models.Dojo;
import com.example.ninjaAndDojos.Models.Ninja;
import com.example.ninjaAndDojos.Services.DojoService;
import com.example.ninjaAndDojos.Services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService nService;
	
	@Autowired
	private DojoService dService;
	
    @GetMapping("/ninja/new")
    public String index(@Valid @ModelAttribute("ninja")Ninja ninja , Model viewModel ) {
    	List<Dojo> dojos=this.dService.allDojo();
    	viewModel.addAttribute("dojos", dojos);
        return "/index.jsp";
    }
    
    @PostMapping("/ninja/create")
    public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model viewModel) {
    	if(result.hasErrors()) {
        	List<Dojo> dojos=this.dService.allDojo();
        	viewModel.addAttribute("dojos", dojos);
            return "/index.jsp";
    	}
    	else {
//    		System.out.print(ninja);
        	nService.createNinja(ninja);
        	return "redirect:/ninja/new";
    	}

    }
    
    @GetMapping("/dojos/new")
    public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "/dojo.jsp";
    }
    
    @PostMapping("/dojo/create")
    public String addDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result ) {
    	dService.createDojo(dojo);
    	return "redirect:/dojos/new";
    }
    
	  @GetMapping("/dojos/{id}")
	  private String getOneDojo(@PathVariable("id") Long id, Model model) 
	  { 
		  Dojo dojo=this.dService.findDojo(id);
		  model.addAttribute("dojo",dojo);
		  return "alldojo.jsp";
	}
}
