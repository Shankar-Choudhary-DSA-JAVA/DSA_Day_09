package com.day_09_05;

import java.util.Scanner;

public class Demo_11_forBlockScopes2 {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	  int i;
	       for( i=0; i<=n; i++) {
	    	   System.out.println(i);
	       }
	        	System.out.println("Final value is: " +i);
	}

	
	}


