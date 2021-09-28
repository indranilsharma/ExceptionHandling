package com.ExceptionHandling;

import java.io.IOException;

class Manager4{  
	  void m() throws IOException {  
		  int i=10/0;
	         throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws Throwable{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Throwable e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  Manager4 obj=new Manager4();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
	}  
