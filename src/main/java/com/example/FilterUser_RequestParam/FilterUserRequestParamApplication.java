package com.example.FilterUser_RequestParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilterUserRequestParamApplication {
//localhost:8080/users/filter?age=25&city=NewYork
	public static void main(String[] args) {
		SpringApplication.run(FilterUserRequestParamApplication.class, args);
	}

}
