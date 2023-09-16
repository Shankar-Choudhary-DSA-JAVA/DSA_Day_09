package com.day_09_05;

import java.util.Scanner;

public class Demo_21_PatternProblems4Pyramids2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");   

		int n = sc.nextInt();
		int i;
        int val = 1;
        
		for (i = 1; i <= n; i = i + 1) {  // for i=1 , count will print n stars *
			for (int count = 1; count <= i; count = count +1) {
				
						System.out.print(val +" ");
						val=val+1;
						

						}
			System.out.println();
			


		}
		
		
		//
		
		for (i = 1; i <= n; i = i + 1) {  // for i=1 , count will print n stars *
			
	    //    val =1;  // see the differences

			for (int count = 1; count <= i; count = count +1) {
				        val =1;  // see the differences
						System.out.print(val +" ");
						val=val+1;
						

						}
			System.out.println();
		}


	}

}
