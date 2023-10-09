package com.projects.SpringbootInPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootInPracticeApplication implements CommandLineRunner {

	protected static final Logger logger = LoggerFactory.getLogger(SpringbootInPracticeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}
