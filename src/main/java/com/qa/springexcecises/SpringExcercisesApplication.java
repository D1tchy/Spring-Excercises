package com.qa.springexcecises;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringExcercisesApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(SpringExcercisesApplication.class, args);

		System.out.println(beanbag.containsBean("greeting"));
		System.out.println(beanbag.containsBean("clock"));
		System.out.println(beanbag.getBean("clock"));
		System.out.println(beanbag.getBean("clock"));
		System.out.println(beanbag.getBean("clock"));
	}

	@Bean

	public String greeting() {
		return "Kims an idiot";

	}

	@Bean
	public LocalTime clock() {
		return LocalTime.now();
	}

}
