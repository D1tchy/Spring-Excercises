package com.qa.springexcecises.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // a component of the whole class - beans is a single method

public class TestController {
	@GetMapping("/someURL")
	public String thisMethod() {
		return "Idiot let loose";
	}
}
