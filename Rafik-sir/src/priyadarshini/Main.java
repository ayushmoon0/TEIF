package priyadarshini;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter amount to withdraw: ");
		int wd = input.nextInt();
		int balance=10000;
	
		if(balance>=wd) {
			balance-=wd;
			System.out.println("Amount Withdrawn: "+wd);
			System.out.println("Your balance: "+ balance);
		}
	
		else {
			System.out.println("Insufficient Balance");
			System.out.println("Your Balance: "+balance);
		}
		input.close();
	}
}
