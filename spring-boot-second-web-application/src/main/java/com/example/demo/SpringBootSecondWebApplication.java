package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
  Author : Dharmendra Kumar
   28/03/2021
   
   
   we wanted to Deplay login.jsp page  while typing 
   mentioned below URL
   http:localhost:8080/login
   
*/

@SpringBootApplication
public class SpringBootSecondWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecondWebApplication.class, args);
	}

}
