package com.day22.exceptionHandl;

import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		Bank1 b1=new Bank1();
		b1.banking();
	}
}
class Bank1{
	void banking(){
	Atm1 a=new Atm1();
	a.acceptInfo();
	a.verify();
	}
}
class Atm1{
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
		sc.close();
	}
	void verify() {
		if(acc_no==u_acc && pass==u_pass) {
			System.out.println("collect your cash");
		}
		else {
			InvalidInputException e=new InvalidInputException();
			System.out.println(e.getMessage());
		}
	}
}
class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong Credentials";
	}
}
