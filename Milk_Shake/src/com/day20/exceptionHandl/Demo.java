package com.day20.exceptionHandl;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("connection establish");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value 1");
		int a = sc.nextInt();
		System.out.println("Please enter value 2");
		
		int b = sc.nextInt();
		
		
		int c = a/b;
		System.out.println(c);
		System.out.println("connection terminaled");
		
		sc.close();
	}
}
