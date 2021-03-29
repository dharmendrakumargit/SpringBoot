package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
   Author : Dharmendra Kumar
   29/03/2021
   
   
   we wanted to deplay Login page,Valiadte UN,PW. Submit the login page,
   After submitting request we should Redirect to Success and Error Page .
   mentioned below URL
   http:localhost:8080/login
   
*/

@SpringBootApplication
public class SpringBootFourthWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFourthWebApplication.class, args);
	}

}
