package com.day22.exceptionHandl.LISKOV;


/*
 * Rule-1: LISKOV's principle
 * The overridden method in the child class must throw the same exception 
 * as the corresponding method in the parent class or shouldn't throw any exception at all..
 */


import java.sql.SQLException;

public class ParentApp1 {
	public static void main(String[] args) {
		
		
	}
}

class Parent1{
	void disp() throws SQLException{
		
	}
}

class Child1 extends Parent1{
	void disp() {
		
	}
}

//   OR

/*

class Child1 extends Parent{
	void disp() throws SQLException{
	
	}
}
*/