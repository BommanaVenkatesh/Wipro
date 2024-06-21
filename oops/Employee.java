
package com.oops;
public class Employee {
   private int id;
   private String name;
   private String gender;
   private int age;
   private int salary;
   private String designation;
   private String insuranceScheme;
public Employee(int id, String name, String gender, int age, int salary, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.salary = salary;
	this.designation = designation;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public void setInsuranceScheme(String designation,int salary) {
	

	if(salary>5000 && salary<20000 && designation.equals("System Associate")) {
		this.insuranceScheme="Scheme C";
	}else if(salary>=20000 && salary<40000 &&designation.equals("Programmer")) {
		this.insuranceScheme="Scheme B";
	}else if(salary>=40000 && designation.equals("Manager")) {
		this.insuranceScheme="Scheme A";
	}else if(salary<5000 && designation.equals("Clerk")) {
		System.out.println("Inside ");
		this.insuranceScheme="No Scheme";
	}
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
			+ ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
}

   
}
