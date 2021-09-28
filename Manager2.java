package com.ExceptionHandling;

public class Manager2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			int i = 10 / 0;
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
			System.out.println(e);
			e.printStackTrace();
		}
		try {
			System.out.println(4);
			int x []={1,3,4,5,5};
			System.out.println(x[8]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("i learned exception");
		}
		
	}

}
