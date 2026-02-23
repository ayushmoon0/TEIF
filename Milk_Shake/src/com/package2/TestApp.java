package com.package2;

public class TestApp {
	public static void main(String[] args) {
		Test t=new Test();
		int result=t.add(2, 4);
		System.out.println(result);
	}
}


class Test{
	int add(int a, int b) {
		int c=a+b;
		return c;
	}
}