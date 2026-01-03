package com.day20;

// Date:3-Jan
// Method Overriding: 

public class ParentApp {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.disp();
		
		Child c=new Child();
		c.disp();
		
		Parent p1=new Child();
		p1.disp();
	}
}


class Parent{
	void disp() {
		System.out.println("Thiss is parent method");
	}
}

class Child extends Parent{
	void disp() {
		System.out.println("This is child method");
	}
}