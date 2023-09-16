package com.day_09_05;

import java.util.Scanner;

public class Demo_1 {

	public static void main(String[] args) {

		// given two numbers a and n, print a^n
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();

	        int a  =sc.nextInt();
            int i =1 ; // initializations
            int ans = 1;
            
            while(i<=n) {
            	ans = ans*a; // ans = 5*a;
                i=i+1;

             }
        	System.out.println(ans);

            
	}

}
