package org.venky;

public class CommandLine {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}

	}

}
