package com.OnlinePractice;

public class TestAuthor {

	public static void main(String[] args) {

     Author a = new Author("Archana", "email@email.com", 'f');
     System.out.println(a);
     
     System.out.println(a.getEmail());
     System.out.println(a.getGender());
     

	}

}
