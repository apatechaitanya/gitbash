package com.chaitanya.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		log.info("Main method");
		SpringApplication.run(DemoApplication.class, args);

	}

}
