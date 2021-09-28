package com.ExceptionHandling;

class UIExceptoion extends RuntimeException {
	UIExceptoion(String s) {
//	to make description message to default exception handler  
		super(s);
	}
}

class CodeException extends RuntimeException {
	CodeException(String s) {
		super(s);
	}
}

public class Throw_CustomizedException2 {
	public static void main(String[] args) {

		int a = 5;
		if (a > 3) {
			throw new UIExceptoion("HTML");
		} else {
			throw new CodeException("Java");
		}
	}
}
