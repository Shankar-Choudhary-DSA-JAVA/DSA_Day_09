package com.day_09_05;

import java.util.Scanner;

public class Demo_3_ForWhileLoops2 {

	public static void main(String[] args) {

		// given all even nos between 1 to n
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        //using while loops
            int i =0; // initializations
            
            while(i<=n) {
            	System.out.println(i);

                i=i+2;

             }
System.out.println("**************************");
            
           // using for loops
           // i<=n; cant do this
               i=0;
            for(; i<=n; ) {
               // for(i=0; i<=n; i=i+2) {

            	System.out.println(i);
            	i=i+2; // we can do this as well
            }
            
	}

}
