package com.coding.date.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/date")
	public String Date(Model model) {
		String name="EEEEE,'the' d 'of' MMMMM , yyyy";
		SimpleDateFormat date1=new SimpleDateFormat(name);
		String today=date1.format(new Date());
		model.addAttribute("date",today);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		String currenTime="h:mm a";
		SimpleDateFormat time=new SimpleDateFormat(currenTime);
		String todayTime=time.format(new Date());
		model.addAttribute("time",todayTime);
		return "time.jsp";
	}
}
