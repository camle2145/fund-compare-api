package com.leocam.fund_compare_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class FundCompareApiApplication {

	@Autowired
	private static Environment env;

	public static void main(String[] args) {

		System.out.println("DB URL: " + env.getProperty("DB_URL"));
		System.out.println("DB USER: " + env.getProperty("DB_USER"));	

		SpringApplication.run(FundCompareApiApplication.class, args);
	}

}
