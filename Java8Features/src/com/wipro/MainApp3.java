package com.wipro;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		StringTransform stringTransform=string->string.toUpperCase();
		String uppercase=stringTransform.stringTransform(s);
		System.out.println("UpperCase :"+uppercase);
		
		StringTransform stringReverse=string->stringReverse(string);
		String reverse=stringReverse.stringTransform(s);
		System.out.println("Reverse :"+reverse);
	}
 private static String stringReverse(String s) {
	 char[] c=s.toCharArray();
	 int i=0,j=c.length-1;
	 while(i<j) {
		 char temp=c[i];
		 c[i]=c[j];
		 c[j]=temp;
		 i++;j--;
	 }
	 return new String(c);
 }
}
