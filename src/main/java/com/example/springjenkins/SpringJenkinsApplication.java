package com.example.springjenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication {

	@PostConstruct
	public void init() {
		log.info("application started...");
	}

	public static void main(String[] args) {
		log.info("application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
