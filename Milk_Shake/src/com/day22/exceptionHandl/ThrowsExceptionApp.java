package com.day22.exceptionHandl;

import java.util.Scanner;

public class ThrowsExceptionApp {
	public static void main(String[] args)  {
		System.out.println("Main connection established");
		Test4 t1=new Test4();
		try {
			t1.gamma();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main connection Terminated");
	}
}

class Test4{
	
	void gamma() throws Exception{
		System.out.println("Connectino 3 established");
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter v1: ");
		int a=input.nextInt();
		System.out.println("Please Enter v2: ");
		int b=input.nextInt();
			int c=a/b;
			System.out.println(c);
			
		System.out.println("Connection 3 terminated");
		
		input.close();
	}
}