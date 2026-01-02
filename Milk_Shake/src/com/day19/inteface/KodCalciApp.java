package com.day19.inteface;

import java.util.Scanner;

public class KodCalciApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(".................starting AyushInfoTech!!.................");
		System.out.print("enter value of  a=");
		int a = sc.nextInt();
		System.out.print("enter value of  b=");
		int b = sc.nextInt();
		System.out.println();
		duty(new AyushInfoTech(a, b)) ;
		System.out.println();
		
		System.out.println(".................starting rupesh.................");
		System.out.println();
		duty(new RupeshSoft());
		System.out.println();
		System.out.println(".................starting symbol wala .................");
		System.out.println();
		
		System.out.println("enter value of a ");
		int a1 = sc.nextInt();
		System.out.print("enter value of  b=");
		int b1 = sc.nextInt();
		System.out.print("enter symbol = ");
		String symbol = sc.next();
		char c = symbol.charAt(0);
		duty1(new symbolwala(a1,b1),c);		
		System.out.println();
//		System.out.println(KodCalci.a);
		sc.close();
	}
	static void duty ( KodCalci c) {
		c.add();
		c.div();
		c.mul();
		c.sub();
	}
	static void duty1 (KodCalci c , char operator ) {
		switch (operator) {
		case '+' :
			c.add();
			break;
			
		case '/' :
			c.div();
			
			break;
		case '*' :
			c.mul();
			
			break;
		case '-' :
			c.sub();
			break;
		}	
	}
}
//interface KodCalci1{
//	void add();
//	void sub();
//}

class RupeshSoft implements KodCalci {
	
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	public void sub() {
		// TODO Auto-generated method stub
		int a = 10 ;
		int b = 20 ;
		int c = a-b;
		System.out.println("Subtraction: "+ c);
	}
	public void mul() {
		// TODO Auto-generated method stub
		int a = 10 ;
		int b = 20 ;
		int c = a*b;
		System.out.println("Multiplication: "+c);	
	}
	public void div() {
		// TODO Auto-generated method stub
		int a = 10 ;
		int b = 20 ;
		int c = a/b;
		System.out.println("Division: "+c);
	}
}


class AyushInfoTech implements KodCalci {
	int a ;
	int b ;
	int c ;
	AyushInfoTech (int a , int b) {
		this.a= a;
		this.b =b;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		c= a+b;
		System.out.println("Addition:"+ c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		c= a-b ;
		System.out.println("Subtraction: "+c);
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
		
		c= a*b ;
		System.out.println("Multiplication: "+c);
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		c= a/b ;
		System.out.println("Division: "+c);
	}
}
class symbolwala implements KodCalci {
	int a ;
	int b ;
	int ans ;
	symbolwala (int a , int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		ans = a +b ;
		System.out.println("Addition: "+ans);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		ans = a -b ;
		System.out.println("Subtraction: "+ans);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		ans = a *b ;
		System.out.println("Multiplication: "+ans);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		ans = a /b ;
		System.out.println("Division: "+ans);
	}
}