package com.example.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


