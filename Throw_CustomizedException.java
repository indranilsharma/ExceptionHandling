package com.ExceptionHandling;

class MyExceptionTestDemo extends RuntimeException {
	public static void undefined() {
		System.out.println("customized undefined exception occured:");
	}
}

public class Throw_CustomizedException {
	public static void main(String[] args) {
		throw new MyExceptionTestDemo();
	}
}
