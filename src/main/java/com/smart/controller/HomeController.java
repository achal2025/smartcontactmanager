package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("title","Home-Smart Contact Managers");
		return "home";
	}
	@GetMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","About-Smart Contact Manager");
		return"about";
	}
	@GetMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title","Register-smart contact Manager");
		return"signup";
	}
} 
