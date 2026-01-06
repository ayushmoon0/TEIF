package com.day22.exceptionHandl;

import java.util.Scanner;

public class BankProjectApp{

	public static void main(String[] args) {
		Bank2 b1=new Bank2();
		b1.banking();
	}
}
class Bank2{
	void banking(){
	Atm2 a=new Atm2();
	
	try {
		a.acceptInfo();
		a.verify();
	} catch (InvalidInputException1 e) {
		System.out.println("Wrong Pin");
		System.out.println("Attempt 2");
		try {
			a.acceptInfo();
			a.verify();
		} catch (InvalidInputException1 e1) {
			System.out.println("wrong Pin");
			System.out.println("Final Attempt");
			try {
				a.acceptInfo();
				a.verify();
			} catch (InvalidInputException1 e2) {
				System.out.println("Your ATM is blocked for 24 hr");
			}
		}
	}
	}
}
class Atm2{
	int acc_no=123456;
	int pass=124;
	int u_acc;
	int u_pass;
	void acceptInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please eneter your acc_no");
		u_acc=sc.nextInt();
		System.out.println("please eneter your pass");
		u_pass=sc.nextInt();
	
	}
	void verify() throws InvalidInputException1 {
		if(acc_no==u_acc && pass==u_pass) {
			System.out.println("collect your cash");
		}
		else {
			InvalidInputException1 e=new InvalidInputException1();
			
			throw e;
		}
	}
}
class InvalidInputException1 extends Exception{
	public String getMessage() {
		return "Wrong Credentials";
	}
}
