package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FridgeToTableApplication {
	
	public FridgeToTableApplication() {
		System.out.println("WORKINGG!");
	}
	public static void main(String[] args) {
		SpringApplication.run(FridgeToTableApplication.class, args);
	}

}
