package com.clozanoga.financeapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.mongobee.Mongobee;

@SpringBootApplication
public class FinanceappApplication {

	private static final Logger log = LoggerFactory.getLogger(FinanceappApplication.class);
	private static final String apiKey = "2d7dbec1-0aa2-4d6e-82ad-8a5e20ca1138";
	
	public static void main(String[] args) {
		SpringApplication.run(FinanceappApplication.class, args);
	}

}
