package org.venky;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=scn.next();
		System.out.println("Enter Last Name");
		String lastName=scn.next();
		System.out.println("Enter Gender");
		String gender=scn.next();
		System.out.println("Enter Age");
		int age=scn.nextInt();
		System.out.println("Enter Weight");
		float weight=scn.nextFloat();
		Person person=new Person(firstName,lastName,gender,age,weight);
		System.out.println(person);

	}

}
