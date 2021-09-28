package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resources_Multicatch_block {

	public static void main(String[] args) {
//		no need to close resources in finally block --it will be auto close 
//		(autoable Interface implemented)

//		try with multiple resources
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"), 10 / 0)) {
//			by default try-with_resoureces all are final 
//			br = new BufferedReader(new FileReader("abc.txt"));

//			multi catch block ---FileNotFoundException because parent IOException available
		} catch (ArithmeticException | IOException e /* | FileNotFoundException */ ) {
			e.printStackTrace();
		}
	}

}
