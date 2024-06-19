package org.venky;

public class Person {
   private String firstName;
   private String lastName;
   private String gender;
   private int age;
   private float weight;
public Person(String firstName, String lastName, String gender, int age, float weight) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.age = age;
	this.weight = weight;
}
@Override
public String toString() {
	return "---Person Details---\n firstName: " + firstName + "\n lastName: " + lastName + "\n gender: " + gender + "\n age:" + age
			+ "\n weight: " + weight;
}
   
}
