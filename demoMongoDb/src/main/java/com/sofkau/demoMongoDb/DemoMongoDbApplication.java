package com.sofkau.demoMongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMongoDbApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
