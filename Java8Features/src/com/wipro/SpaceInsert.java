package com.wipro;

import java.util.Scanner;

public class SpaceInsert {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		StringTransform space=string->{
			String newString="";
			for(int i=0;i<string.length()-1;i++) {
				newString+=string.charAt(i)+" ";
			}
			newString+=string.charAt(string.length()-1);
			return newString;
		};
		String result=space.stringTransform(s);
		System.out.println(result);

	}

}
