package com.day_09_05;

import java.util.Scanner;

public class Demo_17_PatternProblems {

	public static void main(String[] args) {
		
		// in loops first inner loops fully executes for its whole values to fullfill its all conditions after
		//that outer loop gets executed

		// pattern problems
		// Square patterns

		// always think in terms of rows
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");

		int n = sc.nextInt();
		int i;
		// int count; // ot int j;

		for (i = 1; i <= n; i = i + 1) { // for i=1 , count will print n stars *
			// this loop just for rows
			
			for (int count = 1; count <= n; count = count + 1) {
				
				//this loop prints the stars
				
				// for each value of i , count =j will executes n times

				System.out.print("* ");
				// first inner loop will executed then the outer loops will get executeds
				// it will print * in a sinle row or line
			}
			System.out.println();
			// it will move us to next line then again inner row will gets executed


		}


	}

}
