package com.ibm.sample;

public class Calculate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int num1 = 100;
	      int num2 = 20;

	      System.out.println("num1 + num2: " + (num1 + num2) );
	      System.out.println("num1 - num2: " + (num1 - num2) );
	      System.out.println("num1 * num2: " + (num1 * num2) ); 
	      System.out.println("num1 / num2: " + (num1 / num2) );
	      System.out.println("num1 % num2: " + (num1 % num2) );
	   }
	
	public static int cube(int n){  
		int num = 20;
		System.out.println("Cube of "+ num + " is ");
        return num*num*num; 
        
	}
}
