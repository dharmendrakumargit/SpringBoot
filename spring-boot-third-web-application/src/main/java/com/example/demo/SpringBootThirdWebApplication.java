package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
  Author : Dharmendra Kumar
   28/03/2021
   
   
   we wanted to deplay dynamic message to login.jsp ,which is passing from URL as 
   mentioned below URL
   http:localhost:8080/login?name=Dharmendra Kumar
   
*/

@SpringBootApplication
public class SpringBootThirdWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThirdWebApplication.class, args);
	}

}
