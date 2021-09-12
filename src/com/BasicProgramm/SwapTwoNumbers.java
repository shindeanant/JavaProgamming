package com.BasicProgramm;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter two numbers:");
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		
		int num2 = sc.nextInt();
		
		int swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("After swaping number is : ");
		
		
		System.out.println("First number : " + num1);
		
		System.out.println("second number:" + num2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
