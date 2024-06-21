package com.oops;

import java.util.Scanner;

public class MedicalInsurance {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Id");
		int id=scn.nextInt();
		System.out.println("Enter the Name");
		String name=scn.next();
		System.out.println("Enter the Gender");
		String gender=scn.next();
		System.out.println("Enter Age");
		int age=scn.nextInt();
		System.out.println("Enter the salary");
		int salary=scn.nextInt();
		System.out.println("Enter the Designation");
		String designation=scn.next();
		Employee employee=new Employee(id,name,gender,age,salary,designation);
		employee.setInsuranceScheme(designation,salary);
		System.out.println(employee);

	}

}
