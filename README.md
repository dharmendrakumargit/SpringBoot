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

											 
											   
