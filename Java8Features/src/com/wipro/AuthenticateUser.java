package com.wipro;

import java.util.Scanner;

public class AuthenticateUser {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the username");
		String userName=scn.nextLine();
		System.out.println("Enter the password");
		String password=scn.nextLine();
		Authentication auth=(user,pass)->{
			if(user.equals("venkatesh") && pass.equals("Venky@1729")) return true;
			else return false;
		};
		boolean result=auth.authentication(userName, password);
		if(result) System.out.println("Authentication Successful");
		else System.out.println("Invalid User");

	}

}
