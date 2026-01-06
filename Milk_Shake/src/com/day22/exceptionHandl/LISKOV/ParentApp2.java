package com.day22.exceptionHandl.LISKOV;


/*
 * Rule-2: LISKOV's principle
 * The overridden method in the child class  might throw a different exception
 * as compared to the corresponding method in the parent class provided that the exception
 * shares a IS-A relationship
 */

public class ParentApp2 {
	public static void main(String[] args) {
		
	}
}

class Parent2{
	void disp() throws RuntimeException{
		
	}
}

class Child2 extends Parent2{
	void disp() throws ArithmeticException{
		
	}
}
