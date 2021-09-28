package com.ExceptionHandling;

public class Demo_Finally {

	public static void main(String[] args) {
		try {
			int data = 5 / 0;
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block will be exccuted");
		}
		System.out.println("rest of phe code...");
	}
}
