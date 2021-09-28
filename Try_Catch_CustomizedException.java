package com.ExceptionHandling;

public class Try_Catch_CustomizedException {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("getMessage :"+e.getMessage());
			System.out.println("toString :"+e.toString());
		}

	}

}
