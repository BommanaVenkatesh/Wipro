package org.venky;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		s=s.toLowerCase();
		char[] c=s.toCharArray();
		int i=0,j=c.length-1;
		boolean isFlag=true;
		while(i<j) {
			if(c[i]!=c[j])
			{
				isFlag=false;
				break;
			}
			i++;
			j--;
		}
		if(isFlag) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
