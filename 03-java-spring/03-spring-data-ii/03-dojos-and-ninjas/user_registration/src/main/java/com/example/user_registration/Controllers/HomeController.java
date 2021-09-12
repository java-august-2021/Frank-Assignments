package com.example.user_registration.Controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user_registration.Models.User;
import com.example.user_registration.Service.UserService;

@Controller
public class HomeController {
	@Autowired
    private UserService userService;
    

    @GetMapping("/")
    public String index(@ModelAttribute("user") User user) {
        	return "login.jsp";
    }
	
    @PostMapping("/register")
    public String registerForm(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if(result.hasErrors()) {
        	return "login.jsp";
        }
        session.setAttribute("username", user.getFirstname());
    	return "Home.jsp";
    }
}
