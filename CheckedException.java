package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//exceptions that are checked at compile time
//then the method must either handle the exception 
//or it must specify the exception using throws keyword

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
//		 without try catch Unhandled exception type FileNotFoundException
//		it should be checked at compiletime only  
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.close();
		pw.println("India");
//		unchecked exception runtime
		System.out.println(10 / 0);
	}

}
