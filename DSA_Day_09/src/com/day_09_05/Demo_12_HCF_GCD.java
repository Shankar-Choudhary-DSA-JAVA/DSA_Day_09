package com.day_09_05;

import java.util.Scanner;

public class Demo_12_HCF_GCD {

	public static void main(String[] args) {

		// GCD or HCF of two numbers means
		// Find the largest numbers which divide the both numbers
		
		// gcd of two numbers is always min of (a,b)
		
		//1.first find the min of two numbers and then use loop on that numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int a = sc.nextInt();

		int b = sc.nextInt();
	
		System.out.println(Math.min(a, b));
	}

}
