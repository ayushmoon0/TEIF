package com.day20.exceptionHandl;

import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		try {
		System.out.println("connection established");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please value 2 to divide");
		int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
			System.out.println("please enter size of an array");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("please enter index no.arr");
			int n=sc.nextInt();
			arr[n]=999;
			sc.close();

		}
		
		catch (ArithmeticException e) {

			System.out.println("Divide by zero is not allowed");
		}
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("please define the index no. within a range");
		}
		catch (NegativeArraySizeException e) {

			System.out.println("Please enter the positive size of array");
		}
		catch (Exception e) {

			System.out.println("Divide by zero is not allowed");
		}

		System.out.println("connection terminated");
	}

}
