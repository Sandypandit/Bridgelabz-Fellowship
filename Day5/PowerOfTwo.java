package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();  //Take user value
        int power = 1;
        for (int i=1;i<=n;i++){
            for(int j=0;j<=i;j++);{
                power = power * 2; //Calculating power of two
            }

            System.out.printf("2^%d= ",i);
            System.out.println(power);
        }
    }
}