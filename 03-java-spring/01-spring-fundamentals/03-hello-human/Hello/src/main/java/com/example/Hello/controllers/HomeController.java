package com.example.Hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("coding")
public class HomeController {

		@RequestMapping("")
		public String queryName(@RequestParam(value="q", required=false) String searchQuery, Model model) {
			model.addAttribute("search", searchQuery);
			if(searchQuery==null) {
				return "default.jsp";
			}
			return "index.jsp";
		}
	}
