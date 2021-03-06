package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${app.message}")
	String message;
	
	@GetMapping("/api/hola")
	public String hola() {
		System.out.println("xd"+message);
		return "Hi";
	}
	
	@GetMapping("/api/hola2")
	public String hola2() {
		System.out.println("xd"+message);
		return "Hi2";
	}
	
	@GetMapping("/")
	public String bootstrap() {
		System.out.println("bootstrap");
		return "bootstrap";
	}
}
