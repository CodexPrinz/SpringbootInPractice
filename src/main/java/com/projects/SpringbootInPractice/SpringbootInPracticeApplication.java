package com.projects.SpringbootInPractice;

import com.projects.SpringbootInPractice.model.Course;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class SpringbootInPracticeApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringbootInPracticeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootInPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = new Course();
		course.setId(1);
		course.setRating(0);
		Validator validator= Validation.buildDefaultValidatorFactory().getValidator();

		Set<ConstraintViolation<Course>> violations = validator.validate(course);

		violations.forEach(courseConstraintViolation -> logger.error("A constraint violation has occurred. Violation " +
				"details: [{}].", courseConstraintViolation));
	}
}
