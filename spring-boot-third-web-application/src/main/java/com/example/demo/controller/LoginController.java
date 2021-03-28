package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String getLoginMessage(@RequestParam String name,ModelMap model) {
		
		model.addAttribute("name", name);
		
		return "login";
	}

}
