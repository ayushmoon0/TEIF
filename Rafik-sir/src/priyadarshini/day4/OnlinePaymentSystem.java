package priyadarshini.day4;

import java.util.Scanner;

interface Payment{
	void pay(double payment);
}

abstract class OnlinePayment {
	abstract void generateReceipt();
}
class CreditCardPayment extends OnlinePayment implements Payment {
	
	public void pay(double payment) {
		System.out.println("Payment of "+payment+" done using Credit Card");
	}
	public void generateReceipt()
	{
		System.out.println("Receipt generated successfully.!!");
	}
	
}

class UPIPayment extends OnlinePayment implements Payment{
	public void pay(double payment) {
		System.out.println("Payment of "+payment+" done using UPI");
	}
	public void generateReceipt()
	{
		System.out.println("Receipt generated successfully.!!");
	}
}
public class OnlinePaymentSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount: ");
		double payment = input.nextDouble();
		CreditCardPayment c1 = new CreditCardPayment();
		
//		c1.pay(payment);
//		c1.generateReceipt();
		
		UPIPayment u1 = new UPIPayment();
		u1.pay(payment);
		u1.generateReceipt();
	
		input.close();
	}
}
