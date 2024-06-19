package org.venky;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scn.next();
		System.out.println(s);
		boolean isFlag=true;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)>s.charAt(i+1)) {
				isFlag=false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("Postive String");
		}else {
			System.out.println("Negative String");
		}
		

	}

}
