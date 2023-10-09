package com.projects.SpringbootInPractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * @Order -> determines which CommandLineRunner will be executed first
 * */
@Order(1)
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    protected final Logger logger = LoggerFactory.getLogger(MyCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("MyCommandLineRunner executed as a Spring Component");
    }
}
