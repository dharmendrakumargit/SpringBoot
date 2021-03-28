package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 Author Dharmendra Kumar
 28/03/2021
 
we wanted to Deplay "Hello World" Message on Browser while typing 
mentioned below URL
http:localhost:8080/login
*/
/*
 importance of Dev tools--> no need to again and again re start the server after code changes
 Auto restart by Spring Boot

 */

@SpringBootApplication
public class SpringBootFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}

}
