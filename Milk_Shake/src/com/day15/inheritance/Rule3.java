package com.day15.inheritance;

// Rule No.3


class Parent3{
	public Parent3() {
		System.out.println("This is parent const");
	}
}
class Child3 extends Parent3{
	public Child3() {
		System.out.println("this is child");
	}
}

public class Rule3 {
	public static void main(String[] args) {
		Child3 c=new Child3();
		
	}

}