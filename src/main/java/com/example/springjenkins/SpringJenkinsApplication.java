package com.example.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("application started...");
	}

	public static void main(String[] args) {
		logger.info("application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
