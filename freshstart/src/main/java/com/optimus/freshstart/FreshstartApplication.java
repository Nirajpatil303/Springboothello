package com.optimus.freshstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class FreshstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshstartApplication.class, args);
	}

	@Override
	public void run(final String... args){
		log.info(
				String.format("I want a % crust pizza with %s and %s sauce",
						)
		);
	}


}
