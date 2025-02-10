package com.neoteric.december.decemberspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.neoteric.december.decemberspring.dbconnection")
@EnableJpaRepositories("com.neoteric.december.decemberspring.dbconnection.repository")
public class DecemberspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecemberspringApplication.class, args);
	}

}
