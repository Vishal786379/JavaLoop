package com.vishal.loop;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year you want to check wether it is leap year or Not : ");
		int year = scanner.nextInt();
		
		  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        } 
	}
	
}
