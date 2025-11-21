package com.ace.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AceBackendApplication.class, args);
		System.out.println("EchoHub Application has started successfully!");
		System.out.println("Visit http://localhost:8080 to access the application.");
	}

}
