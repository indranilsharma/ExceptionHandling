package com.ExceptionHandling;

public class Manager1 {

	public static void main(String[] args) {
		try {
			int i = 10;
			int x = i / 0;
			int a[] = { 1, 2, 8, 6 };
			System.out.println(a[6]);
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
       		catch(ArrayIndexOutOfBoundsException ex)
		{
		System.out.println(ex);
		ex.printStackTrace();
		}
		// System.out.println(i);
		// System.out.println(x);
		// System.out.println(a[5]);
	}
}
