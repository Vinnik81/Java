package com.example.spring;


import com.example.spring.repository.BranchesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setOutputStreaming(false);
		requestFactory.setReadTimeout( 10 * 1000);
		requestFactory.setConnectTimeout( 10 * 1000);
		restTemplate.setRequestFactory(requestFactory);
		return restTemplate;
	}*/
}


