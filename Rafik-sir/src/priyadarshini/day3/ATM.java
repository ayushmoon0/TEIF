
package priyadarshini.day3;

import java.util.Scanner;

public class ATM {
	static void withdraw(int balance, int amount) throws Exception  {
		
			if(amount>balance) throw new Exception("Insufficient Balance");
			else {
				System.out.println("Transaction Successfull..");
				System.out.println("Amount Debited: "+amount);
				System.out.println("Available Balance: "+(balance-amount));
			}
			
	}
	public static void main(String[] args) {
		int balance=10000;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount: ");
		int amount = input.nextInt();
				
		try {
			withdraw(balance, amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			input.close();
		}
	}

}
