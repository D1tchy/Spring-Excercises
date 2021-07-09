package com.qa.springexcecises.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.springexcecises.domain.Person;

@Service
public class PersonServiceList {
	private List<Person> people = new ArrayList<>();

	// Create - A method to add to the list
	public String createPeople(Person c) {
		this.people.add(c);
		return ("successfullly added human");
	}

	// Read - a method from the list
	public List<Person> GetPeople() {
		return this.people;
	}

	// Update - A method to replace an existing entry
	public Person updateReplacePerson(int index, Person newHuman) {
		this.people.set(index, newHuman);
		return newHuman;
	}

	// Delete - Remove entry from the list
	public void removePerson(int index) {
		this.people.remove(index);
	}
}
