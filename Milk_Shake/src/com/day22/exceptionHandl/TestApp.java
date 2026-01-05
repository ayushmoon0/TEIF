package com.day22.exceptionHandl;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		System.out.println("Main connection established");
		Test1 t1=new Test1();
			try {
				t1.alpha();
			} catch (Exception e) {
				
				System.out.println("exception handled by main");
			}
		System.out.println("Main connection Terminated");
	}
}

class Test1{
	void alpha() {
		System.out.println("Connection 1 established");
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("Connection 1 terminated");
	}
}

class Test2{
	
	void beta() {
		System.out.println("Connection 2 established");
		Test3 t3=new Test3();
		try {
			t3.gamma();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled by beta");
		}
		System.out.println("Connection 2 terminated");
	}
}
class Test3{
	
	void gamma() throws Exception {
		System.out.println("Connectino 3 established");
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter v1: ");
		int a=input.nextInt();
		System.out.print("Please Enter v2: ");
		int b=input.nextInt();

			int c=a/b; 
			System.out.println(c);

		System.out.println("Connection 3 terminated");
			input.close();	
	}
}
