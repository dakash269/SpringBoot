package com.javasampleapproach.angularjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication

public class SpringBootAngularJsApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringBootAngularJsApplication.class, args);
	}
}