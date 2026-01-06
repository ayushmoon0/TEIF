package com.day16.polymorphism;

public class ParentApp {
	public static void main(String[] args) {
		Child c=new Child();
		c.disp();
	}
}

class Parent{
	void disp() {
		System.out.println("This is parent method");
	}
}

class Child extends Parent{
	protected void disp() {
		System.out.println("This is child method");
	}
}