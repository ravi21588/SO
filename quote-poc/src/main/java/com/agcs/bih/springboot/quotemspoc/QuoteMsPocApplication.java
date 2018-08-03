package com.agcs.bih.springboot.quotemspoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Basic Spring Boot application that loads the Camel XML file using @ImportResource
 */
@SpringBootApplication
@ImportResource("classpath:camel-context.xml")
public class QuoteMsPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteMsPocApplication.class, args);
	}
}
