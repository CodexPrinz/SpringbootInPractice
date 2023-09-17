package com.projects.SpringbootInPractice;

import com.projects.SpringbootInPractice.config.DbConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class SpringbootInPracticeApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootInPracticeApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootInPracticeApplication.class, args);

		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringbootInPracticeApplication.class, args);

		DbConfiguration dbConfiguration = applicationContext.getBean(DbConfiguration.class);
		log.info(dbConfiguration.toString());

		Environment env = applicationContext.getBean(Environment.class);
		log.info("Congigured application timeout value: "+env.getProperty("app.timeout"));
	}

}
