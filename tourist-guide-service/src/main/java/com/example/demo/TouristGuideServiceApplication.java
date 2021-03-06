package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domains.TouristGuide;

@SpringBootApplication
public class TouristGuideServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristGuideServiceApplication.class, args);
	}

	@Bean
	public TouristGuide defaValue() {
		
		return new TouristGuide();
	}
}
