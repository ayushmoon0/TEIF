package com.day20;

// Date:3-Jan
// Method Hiding: -->> using static keyword

public class ParentApp1 {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.disp();
		
		Child1 c=new Child1();
		c.disp();
		
		Parent1 p1=new Child1();
		p1.disp();
	}
}


class Parent1{
	static void disp() {
		System.out.println("Thiss is parent method");
	}
}

class Child1 extends Parent1{
	static void disp() {
		System.out.println("This is child method");
	}
}