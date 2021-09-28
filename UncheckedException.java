package com.ExceptionHandling;

public class UncheckedException {
	
//	exceptions that are not checked at compiled time
//	exceptions under Error and RuntimeException classes are unchecked exceptions
	
	public static void main(String[] args) {

//		It compiles fine, but it throws ArithmeticException when run.
		System.out.println(10 / 0);
	}
}
