package com.qa.springexcecises.domain;

public class Dog {

	private String breed;
	private String name;
	private int age;
	private String colour;
	private boolean radjie;

	public Dog() {

	}

	// created default constructor set above right click, source create constructor
	// using field
	public Dog(String breed, String name, int age, String colour, boolean radjie) {
		super();
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.radjie = radjie;
	}

	// create getters and setter
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isRadjie() {
		return radjie;
	}

	public void setRadjie(boolean radjie) {
		this.radjie = radjie;
	}

}