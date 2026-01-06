package com.day22.exceptionHandl.LISKOV;


//LISKOV's Principle

// Rule-4: Stack Overflow Error Handle


import java.sql.SQLException;

public class ParentApp {

	public static void main(String[] args) {
		disp();

	}
	static void disp() {
		System.out.println("hello from disp");
		try {
			disp();
		}catch (Error e) {
			System.out.println("Error handled");
		}
	}
}

class Parent{
	void disp() throws SQLException {
		
	}
}
class Child extends Parent{
	void disp() throws ArithmeticException {
		
	}
}