package dev.niiad.juha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JuhaApplication {
	private static final Logger logger = LoggerFactory.getLogger(JuhaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JuhaApplication.class, args);

		logger.info("Application started");
	}

}
