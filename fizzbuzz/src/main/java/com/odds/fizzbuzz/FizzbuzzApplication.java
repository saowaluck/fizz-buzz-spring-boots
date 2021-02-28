package com.odds.fizzbuzz;

import coach.baseball;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);

		System.out.println(new baseball().getDailyWorkout());
	}

	public String get(Integer number){
		String result;
		if(number % 15 == 0){
			result = "fizzbuzz";
		}
		else if(number % 3 == 0){
			result = "fizz";
		}else if(number % 5 == 0){
			result = "buzz";
		}else{
			result = number.toString();
		}
		return result;
	}
}
