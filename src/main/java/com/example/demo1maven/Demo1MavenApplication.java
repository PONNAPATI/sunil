package com.example.demo1maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo1MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1MavenApplication.class, args);
	}

	@GetMapping("/hello")
	public String test() {
	 return "Hello world";
	}

}
