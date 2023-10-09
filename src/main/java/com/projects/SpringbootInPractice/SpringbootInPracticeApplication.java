package com.projects.SpringbootInPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootInPracticeApplication {

	protected static final Logger logger = LoggerFactory.getLogger(SpringbootInPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInPracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			logger.info("***** Spring boot app CommandLineRunner has executed *****");

		};
	}
}
