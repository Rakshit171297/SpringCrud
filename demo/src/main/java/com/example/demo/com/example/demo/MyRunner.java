package com.example.demo.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	Car car;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		car.start();
		car.stop();
	}

}
