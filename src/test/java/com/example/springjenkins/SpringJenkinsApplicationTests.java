package com.example.springjenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("test case executing!!!");
		assertEquals(true,true);
	}

}
