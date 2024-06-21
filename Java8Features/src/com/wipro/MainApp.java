package com.wipro;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		StringOperation str=string->applyOperation(string);
		String reverse=str.stringOperation(s);
		System.out.println(reverse);

	}
	private static  String applyOperation(String s) {
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}

}
