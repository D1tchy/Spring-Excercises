package com.qa.springexcecises.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // step 1 marking it as a table
public class Person {

	// 1.constructor

	@Id // step 2 primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	private String eyeColour;
	private String name;
	private int age;
	private String dob;

	// 2.default constructor
	public Person() {

	}

// 3.source constructor
	public Person(String eyeColour, String name, int age, String dob) {
		super();
		this.eyeColour = eyeColour;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

// source getters and setters 
	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
