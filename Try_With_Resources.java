package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resources {

	public static void main(String[] args) {
//		no need to close reoureces in finally block --it will be auto close 
//		(autoable Interface implemented)

		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
//			by default try-with_resoureces all are final 

//			br = new BufferedReader(new FileReader("abc.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
