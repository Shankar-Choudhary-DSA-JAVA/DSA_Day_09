package com.day_09_05;

import java.util.Scanner;

public class Demo_5_DivisorsOfANumbers {

	public static void main(String[] args) {

		// given all even nos between n to 1
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        //using while loops
            int i = n; // initializations
            
            while(i >= 0) { //conditions
            	if(i % 2 == 0) {
            		System.out.println(i);

            	}
                i=i-1; //updations


             }

System.out.println(" Using for loops**************************");
            
          // using for loops
           for(i=n; i>=0; i=i-1){
        	   if(i % 2 == 0)

            	System.out.println(i);
            }
           
           
           // all odd from n to 1
           System.out.println("All odd ###################3");
           for(i=n; i>=1; i=i-1) {
        	   if(i % 2 != 0) {
        		   System.out.println(i);
        	   }
           }
            
	}

}
