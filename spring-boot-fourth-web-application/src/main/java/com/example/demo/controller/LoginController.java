package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login")
	public String getLoginpage() {
		
		return "login";
	}
	@PostMapping(value="/login"  )
	public String postLoginMessage(@RequestParam String name,@RequestParam String password,ModelMap map) {
		
	boolean flag=	loginService.validateLoginService(name, password);
	
	      if(!flag) {
	    	  map.addAttribute("errorMessage", "UN PW is invalid");
	      }
	    if(flag)
		return "success";
	    return "login";
	}


}
