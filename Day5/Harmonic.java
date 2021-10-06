package com.bridgelabz;

public class Harmonic {
	// Java Program to Generate Harmonic Series
	public static void main(String args[]){
	 
		// n is the number of values we want in a series
	    int n = 5;
	    double result = 0.0;
	 
        System.out.println("The harmonic series is: ");
	 
	    // printing the harmonic series till n value
        for (int i=1; i<=n; i++) {
	       //calculating harmonic values
	      result += (double)1 / i;
	      System.out.printf("H%d = ",i);
	      System.out.println(result);
	     }
	   
	}
}