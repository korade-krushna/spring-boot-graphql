package com.amaterasu.graphql_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GraphqlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlServiceApplication.class, args);
	}

}
