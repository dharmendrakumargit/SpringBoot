package com.jdbc.example.jdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* Author Dharmendra Kumar 
   14  Mar 2021

   Creating and populating the data to Table in H2 DataBase
   Due to Spring Boot Autoconfiguration feature ,Spring boot Automatically read the data.sql File which is in class path(resources/data.sql).
   Automatically Table will be created and data will be inserted in Table of H2 DataBase.
   please go through pom.xml  where we have added H2 Db Starter ,so H2 Db will also be Autoconfigured.
   web starter added for H2 DB Web Console(H2 DB Web client (ex - similar as tode/sql developer) )
  */
// First Run the Application and copy paste mentioned below URL to the Browser
// H2 DB Console URL --> http://localhost:8080/h2-console/

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

}
