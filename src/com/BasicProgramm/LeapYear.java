package com.BasicProgramm;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any calender year");
		
		int leapyear = sc.nextInt();
		
		if ( leapyear%4==0 && leapyear%100==0 && leapyear%400==0) {
			System.out.println("its leap year");
			
			
		} else {
			 
			System.out.println("its not leap year");
		}
		

	}

}
