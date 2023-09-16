package com.day_09_05;

import java.util.Scanner;

public class Demo_8_primes2 {

	public static void main(String[] args) {

// prime numbers, 1 and itselves divisible		
		// another approach in next class that is break concepts
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i=2;
	        int count = 0;
	      
	        for(i=1; i<=n; i++) {
	        	if(n % i == 0) {
	        		count = count + 1;
	        	}
	        	}
	        System.out.println("Toatal divisors : " +count);
	        	if(count == 2) {
	        		System.out.println("Prime");
	        	}else {
	        		System.out.println("not primess");
	        	}
	        	
	        }
	}


