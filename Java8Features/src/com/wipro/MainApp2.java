package com.wipro;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the 1st double value");
		double d1=scn.nextDouble();
		System.out.println("Enter the 2nd double value");
		double d2=scn.nextDouble();
		AithmeticOperation arithmeticadd=(a1,b1)->a1+b1;
		double add=arithmeticadd.doubleOperation(d1,d2);
		System.out.println("Addition :"+add);
		
		AithmeticOperation arithmeticsub=(a1,b1)->a1-b1;
		double sub=arithmeticsub.doubleOperation(d1,d2);
		System.out.println("Substraction :"+sub);
		
		AithmeticOperation arithmeticmul=(a1,b1)->a1*b1;
		double mul=arithmeticmul.doubleOperation(d1,d2);
		System.out.println("Multiplication :"+mul);
		
		AithmeticOperation arithmeticdiv=(a1,b1)->a1/b1;
		double div=arithmeticdiv.doubleOperation(d1,d2);
		System.out.println("Division :"+div);
		

	}
	

}
