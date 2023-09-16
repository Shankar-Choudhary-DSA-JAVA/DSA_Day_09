package com.day_09_05;

import java.util.Scanner;

public class Demo_7_DivisorsOfANumbers2 {

	public static void main(String[] args) {

		// find all divisors of a numbers also count the no. of divisors
		// done by me itself in first attempts
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i;
	        int count = 0;
	        
	       //m1 
	        for(i=1; i<=n; i=i+1) {
	        	if(n % i == 0) {
	        		System.out.println(i + ",");
	        		count = count +1;
	        	}
	        }
	        System.out.println("Total diviors count is : " +count);
	        }
	}
