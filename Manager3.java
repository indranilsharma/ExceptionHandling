package com.ExceptionHandling;

public class Manager3 {
	public static void test1() {
		System.out.println("test1");
		test2();

	}

	public static void test2() {
		System.out.println("test2");
		String s1 = null;
		//System.out.println(s1.length());
	}

	public static void main(String[] args) {
		System.out.println("main");
		test1();
		main(args);
	}

}
