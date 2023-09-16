package com.day_09_05;

import java.util.Scanner;

public class Demo_9_forBlockScopes {

	public static void main(String[] args) {

//		    Scanner sc = new Scanner(System.in);
//	        System.out.println(" Enter the numbers : ");
//	        int n =sc.nextInt();
	  
	        int money = 10; // scope of main
	        
	        if(true) {
	        	money =20;
	        }
             System.out.println(money);	  // it will print      
	        	
	}

	
	}


