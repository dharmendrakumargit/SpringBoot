package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateLoginService(String name, String password) {
		return ("dharmendra".equalsIgnoreCase(name) && "dharmendra".equalsIgnoreCase(password));
	}

}
