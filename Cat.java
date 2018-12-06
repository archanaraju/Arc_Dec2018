package com.OnlinePractice;

public class Cat {
	
	private String catName;
	private int catAge;
	private String catGender;
	private int catMiceEaten;
	
	public Cat(String catName)
	{
		this.catName = catName;
	}
	
	public double peopleYears(double humanAge)
	{
		return 5.9*humanAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}

	public void setCatGender(String catGender) {
		this.catGender = catGender;
	}

	public void setCatMiceEaten(int catMiceEaten) {
		this.catMiceEaten = catMiceEaten;
	}

	public String getCatName() {
		return catName;
	}

	public int getCatAge() {
		return catAge;
	}

	public String getCatGender() {
		return catGender;
	}

	public int getCatMiceEaten() {
		return catMiceEaten;
	}

}
