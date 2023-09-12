package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Logger log4j = LoggerFactory.getLogger(DemoApplication.class);
		log4j.info("This is Jenkins testimonial");
		log4j.info("This is Jenkins test1");
	}

}
