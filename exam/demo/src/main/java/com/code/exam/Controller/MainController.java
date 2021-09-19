package com.code.exam.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.code.exam.Models.Idea;
import com.code.exam.Models.User;
import com.code.exam.Service.IdeaService;
import com.code.exam.Service.UserService;
import com.code.exam.Validator.UserValidator;

@Controller
public class MainController {
	@Autowired
	private UserService uServ;
	
	@Autowired
	private UserValidator uValid;
	
	@Autowired
	private IdeaService ideaSer;
	
	@GetMapping("/register")
	public String regAndLogForm(@ModelAttribute("user") User user) {
		return "register.jsp";
	}
	
	//Create a User
	@RequestMapping(value="/registering", method=RequestMethod.POST)
	public String registering(@Valid @ModelAttribute("user") User user, BindingResult result,HttpSession session) {
		uValid.validate(user, result);
		if(result.hasErrors()) {
			return "register.jsp";
		}
		User thisUser=uServ.registerUser(user);
		session.setAttribute("userId", thisUser.getId());
		
		return "redirect:/dashboard";
	}
	
	// Log in a User
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,@RequestParam("password") String password, RedirectAttributes errors, HttpSession session ) {
		boolean isLoggedIn=uServ.authenticateUser(email, password);
		if(isLoggedIn) {
			User user=uServ.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/dashboard";
		}

		else {
//			viewModel.addAttribute("error","The Email or PassWord is Invalid ,Try Again!");
			errors.addFlashAttribute("error", "Email or PassWord is Invalid ,Try Again!");
			return "redirect:/register";
		}
	}
	
	// Go to Home Page
	@GetMapping("/dashboard")
	public String homePage(HttpSession session, Model viewModel) {
		List<Idea> ideas=ideaSer.findAllIdea();
		
		Long userId=(Long) session.getAttribute("userId");
		User thisUser=uServ.findUserById(userId);
		viewModel.addAttribute("user",thisUser);
		viewModel.addAttribute("listidea", ideas);
		return "Home.jsp";
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/register";
	}
	
	
	@GetMapping("/idea/new")
	public String ideaPage(@ModelAttribute("idea") Idea idea) {
		return "idea.jsp";
	}
	//create an idea
	@PostMapping("/create")
	public String createAnIdea(@Valid @ModelAttribute("idea") Idea idea,BindingResult result,Model viewModel,HttpSession session) {
		Long userId=(Long) session.getAttribute("userId");
		User thisUser=this.uServ.findUserById(userId);
		
		if(result.hasErrors()) {
			viewModel.addAttribute("user",thisUser);
			return "idea.jsp";
		}
			idea.setCreator(thisUser);
			idea.setNumOfLikes(0);
			ideaSer.create(idea);
			
			return "redirect:/dashboard";
		
	}
	//link
	@GetMapping("/likes/{id}")
	public String likeIdea(@PathVariable("id") Long ideaid, HttpSession session) {
		Long userId=(Long) session.getAttribute("userId");
		User thisUser=this.uServ.findUserById(userId);
		Idea likedIdea=ideaSer.findIdeaById(ideaid);
		this.ideaSer.likeAnIdea(thisUser, likedIdea);
		
		return "redirect:/dashboard";
	}
	//unlink
	@GetMapping("/unlikes/{id}")
	public String unLikeIdea(@PathVariable("id") Long ideaid, HttpSession session) {
		Long userId=(Long) session.getAttribute("userId");
		User thisUser=this.uServ.findUserById(userId);
		Idea likedIdea=ideaSer.findIdeaById(ideaid);
		this.ideaSer.unLikeAnIdea(thisUser, likedIdea);
		
		return "redirect:/dashboard";
	}
	// show one idea 
	@GetMapping("/idea/{id}")
	public String oneIdea(@PathVariable("id") Long ideaid,Model viewModel, HttpSession session) {
		Idea oneIdea=ideaSer.findIdeaById(ideaid);
		viewModel.addAttribute("oneIdea",oneIdea);
		return "oneIdea.jsp";
	}
	
	@GetMapping("/idea/{id}/edit")
	public String editIdea(@PathVariable("id") Long ideaid,Model viewModel, HttpSession session) {
		Idea oneIdea=ideaSer.findIdeaById(ideaid);
		Long userId=(Long) session.getAttribute("userId");
		User thisUser=this.uServ.findUserById(userId);
		if(!oneIdea.getCreator().equals(thisUser)) {
			return "redirect:/dashboard";
		}
		viewModel.addAttribute("oneIdea",oneIdea);
		return "edit.jsp";
	}
	@PostMapping("/update/{id}")
    public String update(@PathVariable("id")Long ideaId,@Valid @ModelAttribute("oneIdea") Idea idea ,BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            ideaSer.updateBook(ideaId,idea.getContent());
            return "redirect:/dashboard";
        }
    }
	
	@PostMapping("/delete/{id}")
	public String deleteIdea(@PathVariable("id")Long ideaId) {
		ideaSer.deleteIdea(ideaId);
		return "redirect:/dashboard";
	}
	
}
