package com.ExceptionHandling;

public class DefaultExceptionHandlerDemo {

	public static void main(String[] args) {
		dostuff();

	}

	private static void dostuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
// all work done by JVM  
//		it will print by default exception handler name of the exception:Description of the exception
//		go to particular method doMoreStuff() ask for handler ?
//		then go caller method dostuff()
//		then until reach main()
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.ExceptionHandling.ExceptionTreeDemo.doMoreStuff(ExceptionTreeDemo.java:15)
//		at com.ExceptionHandling.ExceptionTreeDemo.dostuff(ExceptionTreeDemo.java:11)
//		at com.ExceptionHandling.ExceptionTreeDemo.main(ExceptionTreeDemo.java:6)
		System.out.println(10/0);
	}

}
