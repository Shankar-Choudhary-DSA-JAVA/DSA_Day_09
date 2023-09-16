package com.day_09_05;

import java.util.Scanner;

public class Demo_19_PatternProblems3 {

	public static void main(String[] args) {

		// pattern problems         
		// triangle patterns        

		// always think in terms of rows
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");   

		int n = sc.nextInt();
		int i;
		// int count; // or int j;                 

		for (i = 1; i <= n; i = i + 1) {  // for i=1 , count will print n stars *
			for (int count = 1; count <= i; count = count + 1) {
				
				// for each value of i , count =j will executes n times

				System.out.println("* ");
				// first inner loop will executed then the outer loops will get executeds
				// it will print * in a single row or line
			}
			System.out.println();
			
			// it will move us to next line then again inner row will gets executed


		}


	}

}
