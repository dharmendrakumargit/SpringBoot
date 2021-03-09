# SpringBoot
SpringBoot examples
--------------------
                                          Notes  Hibernate
										  ----------------
										     Spring Boot Introduction
											 
										  Spring Boot Goal
										  ----------------
										  1)Spring boot frameWork  becomes Quickest way to Develop Micro Services in java world
										  2)Spring Boot enables to develop production ready Code.
										  -------------
										**  Provide Common Non Functional feature
										  1) Embedded Server
										  2) Matrix
										  3) Health check
										  4) Externalized Configuration
										  
										  Question --> What Spring Boot is not.
										  1) It does not Generate Code(Zero Code Generation)
										  2) It is not Web Server or Application Server
										  
										  
										  ==================================================
										  Spring Boot Feature
										  1)Quick Starter Project With auto configuration.(Web ,JPA,Spring Data,JDBC,REST)
										  2)Embedded Server (Tomcat,Jetty,Underwater)
										  3)Production Ready Feature 
                                               1) Matrix and Health check (Give information about your Services)
											   2) Externalized Configuration.. Provide Different properties files for Diffrent Environment.(Dev,Prod env)
											  
--------------------------------------------------------------------------------------------------------------------------------------------------											  
				**		Before Spring Boot					   
											   Chosing The Frame Work to use and which version to use and 
											   which version will be compatoble to each other was a great challenge before spring boot.
											   Lots of Configuration
											   For example in Spring MVC--- We need to configure DispatcherServelet in Web.xml file.
											   Spring security in web.xml 
											   Context configuration(Context path of Application) in web.xml
											   Need to configure Dependency  && Dependency Version
											   we need to Configure-- View Resolver  
-----------------------------------------------------------------------------------------------------------------------------------------------------
                **      Spring Initializer
                                            **   start.spring.io		

                                             web starter to develope Rest services

** What is Auto Configuration in SpringBoot - How it Works.

@SpringBootApplication
1) It is Spring Context  --> This indicates that this is context File - This file where we declare it(Main method File)	
2) It Enables AutoConfiguration			
3) It Enables ComponentScan	
4) SpringApplication.run() method -- Used to run Spring Context			

      run() method return ApplicationContext.	
-------------------------------------------------------------------------------------------------------------
We are printing the name of bean which is configured using Application Context
@SpringBootApplication
public class SpringBootWithRestControllerExampleApplication {

	public static void main(String[] args) {
	ApplicationContext appContext=	SpringApplication.run(SpringBootWithRestControllerExampleApplication.class, args);
	for(String nameOfBean: appContext.getBeanDefinitionNames() ) {
		System.out.println(nameOfBean);
		
	}
	}

}
** How Autoconfiguration(Spring AutoConfiguration  jar) Works-
----------------------------------------------------------------------------------------------------------
A lot of class being printed because of Autoconfiguration in above code.
How Auto configuration works-- Suppose you need web MVC starter so you added Web MVC Starter.
When Spring boot application start looks in Classpath(Maven Dependencies) it found Spring MVC Starter hence--Spring Autoconfiguration jar
will configure require thing for Web MVC starter --eg Dispatcher Serverlet,Vew resolver
Similar way for many(DataSource Autoconfiguration)
-----------------------------------------------------------------------------------------------------------	
Application.properties
logging.level.org.springframework=DEBUG  

By Enabling Debug you can see in console what are all things are AutoConfigured and what are all are not Auto Configured.

-------------------------------------------------------------------------------------------------------------
** SpringBoot VS Spring VS Spring MVC ---
** Spring FrameWork
What is the Core Problem Spring Framework Solves
   1)  Most important feature of Spring framework is dependency injection.At the core of All the Spring Modules is Dependency Injection
   OR IOC
** WHY -->DI || IOC is important->When we use IOC and DI properly we can develop loosely coupled Application and 
   loosely coupled Application can be easly unit tested
   
   2) Spring Frame Work Solve Duplicate Plunbing COde.
   Example--Spring JDBC-- In Normal JDBC we are writing lot of repetative Code.(eg try,catch,Exception handling, lot of repetative code)
   3) Spring Framework provide good Integration with other framework
           Hibernate for ORM
		   Junit & Mockito for Unit Testing
		   iBatis for Object mapping
		   
** -- What is the core problem Spring MVC Framework solves
       Spring MVC Framework provides decoupled way of developing Web Application
       With simple concept like Dispatcher servlet,Model and view and view resolver
       It makes it easy to develop web application.
Whether you are developing web Application or rest services using spring boot internally you are using Spring MVC

** -- Why do we need SpringBoot
      Spring Base application  lot of configuration
	  
	  When we are using spring MVC we need to configure component scan,dispatcher servlet,view resolver
	  web jar(for delivering ststic content) among other things
	  
	  <bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
          <property name = "prefix" value = "/WEB-INF/jsp/"/>
          <property name = "suffix" value = ".jsp"/>
      </bean>
	  
	  <mvc:resources mapping="/webjar/**" location="/webjar/" />
	  
	  -------------------
	     <servlet>
      <servlet-name>Dispatcher</servlet-name>
      <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
      </servlet-class>
      <load-on-startup>1</load-on-startup>
   </servlet>

   <servlet-mapping>
      <servlet-name>Dispatcher</servlet-name>
      <url-pattern>*.jsp</url-pattern>
   </servlet-mapping>
   
   ----------------------------------
   
   If We are using Hibernate
   We need to Configure DataSource ,Entity Manager ,Transaction Manager in xml files.
   
   -----------------------------------------
   SpringBoot AutoConfiguration  -->Can we think Diffrent
   can we bring more intelligence to this.
   When a Spring MVC added into an application,can we autoconfigure some beans automatically.
   can configure Dispatcher servlet Automatically,Can i configure View resolver automaticallly.
   can i configure Data Source if Hibernate jar is in the class path
   
   Apart from Starter it also provide few monitoring feature
   it has starter to pick diffrent Servlet container.
   --------------------------------------------------------------------------------------------
                 Spring Boot Starter
				 WEB && JPA
   
  ** spring-boot-starter-json  which converts reponse from Bean to JSON format
  
    1) spring-boot-starter-web-services --> For SOAP web services
	2) spring-boot-starter-web          --> Web and Restful Application
	3) spring-boot-starter-test         --> Unit testing and Integration testing
	4) spring-boot-starter-jdbc         --> Transactional JDBC
	5) spring-boot-starter-security     --> Authentication and Authorization using spring security
	6) spring-boot-starter-data-jpa     --> Sping Data Jpa with Hibernate
	7) spring-boot-starter-cache        --> Enabling Spring Framework for caching support
	8) spring-boot-starter-data-rest    --> Expose simple REST services using Spring data rest
  
==--------------------------------------------------------------------------------------------------
** Spring Boot Actuator
Spring Boot Includes a number of additional feature to help you monitor and manage your Application
When it is pushed to production.
you can choose to manage and monitor your application using HTTP End points or with JMX.
Health and Matrix gathering can be automatically applied to your Application

Actuator Reads a lot of Information
(Meta Data,Beans Configuration,Auto Configuration,How many times Specific Service has been called,how many times service has been failed )
 about your Application

To Add the Actuator to Maven based Project to Enable the actuator to your project
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
--------------------------------------------------------------------	
URL for Actuator -->> http://localhost:8080/actuator
if above doesnot work use this  http://localhost:8080/application
Health Url : http://localhost:8080/actuator/health
Info Url : http://localhost:8080/actuator/info
--------------------------------------------------------------------

HAL Browser
JSON Hypertext Application Language, or HAL, is a simple format 
that gives a consistent and easy way to hyperlink between resources in our API. 
Including HAL within our REST API makes it much more explorable to users as well as being essentially self-documenting.

It works by returning data in JSON format which outlines relevant information about the API.

<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-rest-hal-browser</artifactId>

</dependency>


   How to Enable Actuator
   Go to Application.properties-->management.endpoint.web.exposure.include=*
   This will have performance impact so better go specific actuator which is needed not (*)
   
   Spring Tools Plugin-->Add to your Eclipse for Better Suggestion  typing over eclipse editor
   
-------------------------------------------------------------------------------
  *** Spring Boot Developer tool
  This is one of the coolest feature -- Load the code at run time--No need to compile and restart the server
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
</dependency>
If you are using Devloper tools after code changes it hardly takes 2.5 sec to restart the server.
But if you are not using Dev tools hence you need to restart the server manualy(stop and start)
which takes aound 8 -9 sec--this takes more time because it loads all the jar from class path and Application jar.
But in Case Dev tools it does not load the jar from class path it only loading the application jar where changes being identified.
it saves 6 sec for every chnages.
As a Developer we should use.
------------------------------------------------------------------------------------------------------------------------------------


   
   
	   
   


											 
											   
