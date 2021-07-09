package com.qa.springexcecises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springexcecises.domain.Person;
import com.qa.springexcecises.service.PersonServiceList;

//step 1. Define Controller - above the class
@RestController
public class PersonController {
//step2 create the variables in the list 
	// step 3 list

	private PersonServiceList service;

	// Step 4 test
	@Autowired

	public PersonController(PersonServiceList service) {
		this.service = service;
	}

	@GetMapping("/peopleTest") // type of request (location)
	public String thisMethod1() {
		return "People";
	}
	// C = Create

	@PostMapping("/createPeople")
	public ResponseEntity<String> createPeople(@RequestBody Person human) {
		this.service.createPeople(human);
		return new ResponseEntity<String>("successfullly added human", HttpStatus.CREATED);
	}
	// R = Read

	@GetMapping("/readPeople")
	public ResponseEntity<List<Person>> readPeople() {
		return ResponseEntity.ok(this.service.GetPeople());
	}

	// U - update = patch / Replace = put

	@PutMapping("/replacePeople/{index}")

	public ResponseEntity<Person> updateReplacePerson(@PathVariable int index, @RequestBody Person newHuman) {
		this.service.updateReplacePerson(index, newHuman);
		return new ResponseEntity<Person> (HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/removePerson/{index}")
	public void removePerson(@PathVariable int index) {
		this.service.removePerson(index);
	}
}
