package com.day22.exceptionHandl;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		try {

		}catch (Exception e) {
			
		}finally {
			try {
				
			} catch (Exception e1) {
				// TODO: handle exception
			}
		}

		Bank b=new Bank();
		b.banking();
	}
}
class Bank{
	void banking() {
		System.out.println("Bank Connectino established");
		ATM card=new ATM();
		
		try {
			card.transaction();
		} catch (Exception e) {
			System.out.println("info recieved by the bank your amount will refunded within 24 hours");
		}
		System.out.println("Bank Connection terminated");
	}
}
class ATM{
	void transaction() throws Exception {
		System.out.println("ATM Connectino established");
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter v1: ");
		int a=input.nextInt();
		System.out.print("Please Enter v2: ");
		int b=input.nextInt();
		try {
			int c=a/b; 
			System.out.println(c);
		}catch (Exception e) {
			System.out.println("exception handled by atm");
			throw e;
		}
		finally {
			System.out.println("ATM Connection terminated");
			input.close();
		}
			
	}
}
