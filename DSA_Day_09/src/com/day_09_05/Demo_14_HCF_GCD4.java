package com.day_09_05;

import java.util.Scanner;

public class Demo_14_HCF_GCD4 {

	public static void main(String[] args) {

		// GCD or HCF of two numbers means
		// Find the largest numbers which divide the both numbers

		// gcd of two numbers is always min of (a,b)

		// 1.first find the min of two numbers and then use loop on that numbers

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int a = sc.nextInt();

		int b = sc.nextInt();
		int i;
		int gcd=0;
		int smallest;
		
		// 1. first find the min of two nos
		// because the gcd will be always less or equal to the smallest numbers of the given two numbers

		if(a<b) {
			smallest=a;
		}else {
			smallest=b;
		}

		//2. using for loop
		for (i = 1; i <= smallest; i = i + 1) {
			if (a % i == 0 && b % i == 0) {
                   gcd=i; // it will take the last values
			}

		}
		System.out.println(gcd);
	}

}
