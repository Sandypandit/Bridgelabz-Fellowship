package com.javapractice;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int i, Number, Sum = 0;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();

		for(i = 1 ; i <= Number/2 ; i++) {
			if(Number % i == 0)  {
				Sum += i;
			}
		}
		
		if (Sum == Number) {
			System.out.printf("\n%d is a Perfect Number", Number);
		}
		else {
			System.out.printf("\n%d is NOT a Perfect Number", Number);
		}
	}

}

