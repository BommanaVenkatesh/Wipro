package com.wipro;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.nextLine();
		StringTest test=string->isPalindrome(string);
		boolean result =test.stringTest(s);
		if(result) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
		StringTest testcharacter=string->isContains(string,'v');
		boolean result1=testcharacter.stringTest(s);
		if(result1) System.out.println("Given Character is Present");
		else System.out.println("Given Character is Not Present");
		
		

	}
	
	private static boolean isContains(String s,char c) {
		for(int i=0;i<s.length();i++) {
			while(c==s.charAt(i)) return true;
		}
		return false;
	}
	private static boolean isPalindrome(String s) {
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		while(i<j) {
			if(c[i]!=c[j]) return false;
			i++;j--;
		}
		return true;
	}

}
