package com.day_09_05;

import java.util.Scanner;

public class Demo_10_forBlockScopes2 {

	public static void main(String[] args) {

//		    Scanner sc = new Scanner(System.in);
//	        System.out.println(" Enter the numbers : ");
//	        int n =sc.nextInt();
	  
	

    
    if(true) {
    	int money =20;
    	// here scope is till if block, outside the if block, it will not executes
    	// this is called scope of the variables
    }
   //  System.out.println(money);	  // it will not print      
    	
    
    for(int i=0; i<-10; i++) {
    	System.out.println(i);	
    }
  //  System.out.println(i); // scope is defined inside for block only
    }
	
	
	}


