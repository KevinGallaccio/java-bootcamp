package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if(name.equals("Trevor") 
				|| age.equals("36")
		        || name.equals("Kevin")){
			System.out.println("Oh shit it's me !!!");
		} else {
			System.out.println("Who is " + name + "??");
		}
		scanner.close();
	}
}
