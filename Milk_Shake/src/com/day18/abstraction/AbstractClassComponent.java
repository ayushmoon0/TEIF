package com.day18.abstraction;

abstract public class AbstractClassComponent {
	public static void main(String []args) {
		System.out.println(a);
		disp();
	}
	public AbstractClassComponent() {
		
	}
	static int a;
	static {
		a=10;
	}
	static void disp() {
		System.out.println(a);
	}
	int b;
	{
		b=20;
	}
	void disp1() {
		System.out.println(b);
	}
}
