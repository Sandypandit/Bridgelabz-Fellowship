package com.bridgelabz;

public class SwapNumbers {
    public static void main(String arg[]) {
        int x = 30, y = 20;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("After swapping");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("value of x=" + x);
        System.out.println("value of y=" + y);
    }
}