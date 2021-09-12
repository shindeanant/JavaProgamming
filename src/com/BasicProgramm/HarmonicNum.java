package com.BasicProgramm;

import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
	 double n= sc.nextDouble();
		
        double sum = 0.0;
        
        for ( double i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        
        System.out.println("Harmonic value is:" + sum);
        

	}

}
