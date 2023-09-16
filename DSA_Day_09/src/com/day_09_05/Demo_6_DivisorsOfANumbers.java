package com.day_09_05;

import java.util.Scanner;

public class Demo_6_DivisorsOfANumbers {

	public static void main(String[] args) {

		// find all divisors of a numbers
		// done by me itself in first attempts
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i;
	        int divisors;
	        
	       //m1 
	        for(i=1; i<=n; i=i+1) {
	        	if(n % i == 0) {
	        		System.out.println(i);
	        	}
	        	
	        }
	        
	        
	        	// m2 , too handle Arithmetic exceptions
				try {
	        	   for(i=0; i<=n; i=i+1) {
	   	        	if(n % i == 0 && i != 0) {
	   	        		System.out.println(i);
	   	        	}
	        	   }
				}
	        	   catch (Exception e) {
		        		System.out.println("Cant divide it by 0");
	        	   }
				
	        
	        }
	}
