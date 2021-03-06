package com.aws.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbsApplication.class, args);
	}
	
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome to codepipeline";
	}

}
