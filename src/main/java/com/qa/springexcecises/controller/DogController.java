package com.qa.springexcecises.controller;
// moving on to CRUD functionality 

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springexcecises.domain.Dog;

@RestController
//step 1 = define the controller - @RestController press Control + shift + O

public class DogController {

	// Step 2 - The array we create here is just a fill in for a real database
	private List<Dog> dogs = new ArrayList<>();
	// step 3 test the system created so far using @GetMapping

	@GetMapping("/dogtest") // type of request (location)
	public String thisMethod1() {
		return "Dogs";
	}

	// step/ 4 - Create we import a request body
	// c

	

	// R step 5// displaying the full array list
	@GetMapping("/showDogs")
	public List<Dog> readDogs() {
		return this.dogs;

	}

	// step6 U of crud
	// @PutMapping is to replace completely, the example below
	@PutMapping("/newDogs/{index}")
	public Dog updateDog(@PathVariable int index, @RequestBody Dog newDog) {
		this.dogs.set(index, newDog);
		return newDog;

	}
	// Step 7 : D of CRUD - delete
	// index is the bit which changes each time the method is used and updates the
	// URL

	@DeleteMapping("/removeDog/{index}")
	public Dog removeDog(@PathVariable int index) {
		return this.dogs.remove(index);
	}

}
