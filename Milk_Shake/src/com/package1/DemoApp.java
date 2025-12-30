package com.package1;

public class DemoApp {
	public int a;
	protected int b;
	int c;
	private int d;
	public static void main(String[] args) {
		DemoApp d=new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
	}
}
class Demo1{
	void disp1() {
		DemoApp d=new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		//System.out.println(d.d);
	}
}
class Demo2 extends DemoApp{
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}
