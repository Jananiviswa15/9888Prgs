package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //--> @enableauticonfig & @componscan
//webappcontext ioc 
public class RestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiProjectApplication.class, args);
	}

}
