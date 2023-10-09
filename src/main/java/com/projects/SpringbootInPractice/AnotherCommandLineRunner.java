package com.projects.SpringbootInPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class AnotherCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AnotherCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("AnotherCommandLineRunner executed as a Spring ➥ Component");
    }
}
