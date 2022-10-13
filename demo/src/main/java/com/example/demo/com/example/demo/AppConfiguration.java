package com.example.demo.com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfiguration {
	@Bean
	public Car runSportsCar() {
		return new SportsCar();
	}
	@Bean
	@Primary
	public Car runLuxuryCar() {
		return new LuxuryCar();
	}
}
