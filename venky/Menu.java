package org.venky;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		String s="Hello";
      
	int n;
		do {
			System.out.println("-----Select the Choice----");
			System.out.println("1.Add String to Existing String\n2.Replace Odd characters with #\n3.Remove Duplicates\n4.Odd characters to be Upper case\n5.Exit");
			Scanner scn=new Scanner(System.in);
			 n=scn.nextInt();
			switch(n) {
			case 1:System.out.println("Enter the String");
			        String s1=scn.next();
			        System.out.println(s+" "+s1);
			        break;
			case 2:System.out.println("Enter the String");
			        String s2=scn.next();
			        for(int i=0;i<s2.length();i+=2) {
			           s2=s2.replace(s2.charAt(i),'#');  
			        }
			        System.out.println(s2);
			        break;
			case 3:System.out.println("Enter the String");
			       String s3=scn.next();
			       String duplicate="";
			       for(int i=0;i<s3.length();i++) {
			    	  String temp=String.valueOf(s3.charAt(i));
			    	  if(!duplicate.contains(temp)) {
			    		  duplicate+=temp;
			    	  }   
			       }
			       System.out.println(duplicate);
			       break;
			case 4:System.out.println("Enter the String");
			        String s4=scn.next();
			       
			        for(int i=0;i<s4.length();i+=2) {
			      
				           char c=Character.toUpperCase(s4.charAt(i));
				           s4=s4.replace(s4.charAt(i),c); 
				        }
			        System.out.println(s4);
			        break;
			case 5:System.out.println("See you soon!");
			        break;
			}
			
		}while(n!=5);

	}

}
