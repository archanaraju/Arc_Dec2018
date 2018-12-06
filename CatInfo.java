package com.OnlinePractice;

public class CatInfo {

	public static void main(String[] args) {
		
		Cat c1 = new Cat("Cat1");
		Cat c2 = new Cat("Cat2");
		Cat c3 = new Cat("Cat3");
		Cat c4 = new Cat("Cat4");
		
		c1.setCatAge(3);
		c1.setCatGender("Male");
		c2.setCatAge(6);
		c2.setCatGender("FeMale");
		c3.setCatAge(9);
		c3.setCatGender("FeMale");
		c4.setCatAge(12);
		c4.setCatGender("Male");
		
		System.out.println("Cat1 gender is" + c1.getCatGender());

	}

}
