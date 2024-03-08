package com.sam.project_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sam.project_server")
@EnableAutoConfiguration
public class ProjectServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectServerApplication.class, args);
	}

}
