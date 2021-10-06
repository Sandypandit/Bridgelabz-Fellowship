package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("How many time to flip the coin?");
		int n = sc.nextInt();
		int head = 0, tail = 0;
		float result = 0.0f;
		
		for (int i=1; i<=n; i++) {
			result = rd.nextFloat(1);
			if(result<0.50f) { head+=1;}
			else { tail+=1;}
		}
		
		System.out.printf("No. of heads = %d\nNo. of tails = %d", head, tail);
		System.out.println("\nHeads percentage = "+ head*100/n);
		System.out.println("Tails percentage = "+ (tail*100/n));
	}
}
