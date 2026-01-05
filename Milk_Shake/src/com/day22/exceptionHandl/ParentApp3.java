package com.day22.exceptionHandl;


/*
 * Rule-3: LISKOV's principle
 * The overridden method in the child class might throw a different exception as
 * compared to the corresponding method in the parent class provided that it is throwing
 *  a runtime exception..
 */
import java.sql.SQLException;

public class ParentApp3 {
	public static void main(String[] args) {
		
	}
}

class Parent3{
	void disp() throws SQLException{
		
	}
}

class Child3 extends Parent3{
	void disp() throws ArithmeticException{
		
	}
}