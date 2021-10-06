package com.javapractice;

import java.util.concurrent.TimeUnit;

public class StopWatch {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Task Started");
		long startOfTask= System.currentTimeMillis();
		
		TimeUnit.MILLISECONDS.sleep(2000);
		
		System.out.println();
		long endOfTask = System.currentTimeMillis();
		
		long elapsedTime = endOfTask - startOfTask;
		System.out.println(elapsedTime);
	}

}
