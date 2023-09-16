package com.day_09_05;

import java.util.Scanner;

public class Demo_16_HCF_GCDWithMultiInputs {

	public static void main(String[] args) {

		// 15. How to take multiple inputs and find their HCF
		// GCD with multiple inputs

		// GCD or HCF of two numbers means
		// Find the largest numbers which divide the both numbers

		// gcd of two numbers is always min of (a,b)

		// 1.first find the min of two numbers and then use loop on that numbers

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers T : ");
		int T = sc.nextInt(); // no of terms for which you want to find HCF
		int i;
		// take a loop which runs T times
		for(int t=0; t<=T; t++) {
			
			// each T will take two nos and T times
			System.out.println("value of a and b please jiska aapko HCF chahiye :");

			int a = sc.nextInt(); //HCF of a and b
			int b= sc.nextInt();
			int gcd=1;

			System.out.println("value of a and b aapne jo diya: " + a + " " + b);
			
			
			// now i need to print the gcd of these numbers
			
			// nested loop , that is loop inside another loop
			// here inner loop dont know any thing about the outer loop
			
		//	for(i=1; i<= a && i<=b; i=i+1) {
				for(i=1; i<= Math.min(a, b); i=i+1) {

				if(a%i ==0 && b%i == 0) {
					gcd = i;
				}
			}
			System.out.println("HCF is : " +gcd);
			
		}
		
		

		
	}

}
