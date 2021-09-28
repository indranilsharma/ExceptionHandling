package com.ExceptionHandling;

public class Throws_Keyword_Predifined_Exception {

	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	private static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("completed");
	}
}
