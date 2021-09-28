package com.ExceptionHandling;

public class DefaultExceptionHandlerDemo2 {

	public static void main(String[] args) {
		dostuff();
		
//		nothing in the stack because all other method terminated normally 
		
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * com.ExceptionHandling.DefaultExceptionHandlerDemo2.main(
		 * DefaultExceptionHandlerDemo2.java:7)
		 */
		System.out.println(10/0);
	}

	private static void dostuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {

		System.out.println("India");
	}

}
