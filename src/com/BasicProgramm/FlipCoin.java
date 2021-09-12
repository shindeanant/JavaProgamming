package com.BasicProgramm;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		 int heads = 0;
	        int tails = 0;
	        int counter = 1;
	        double randNum = 0.0;
	        Scanner in = new Scanner(System.in);
	         
	        System.out.println("The numbres of times to filp coin ");
	        int flips = in.nextInt();
	         
	        while(counter <= flips)
	        {
	            randNum = Math.random();
	            System.out.print(counter + " " + randNum);
	             
	            if(randNum < 0.5)
	            {
	                heads++;
	                System.out.println(" heads ");
	            }
	            else
	            {
	                tails++;
	                System.out.println(" tails ");
	               }
	            counter++;      
	        }
	        System.out.println();
	        System.out.println("Number of Heads = " + heads);
	        System.out.println("Number of Tails = " + tails);
	        
	    
	        
	        
	         
	}
	
	

}
