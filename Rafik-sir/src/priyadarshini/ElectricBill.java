package priyadarshini;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no. of units: ");
		int unit = input.nextInt();
		
		if(unit<=100) {
			System.out.println("Your Payable amount: "+unit*3);
		}
		else if(unit<=200) {
			System.out.println("Your Payable amount: "+(300+(unit-100)*5));
		}
		else if(unit>200){
			System.out.println("Your Payable amount: "+(800+((unit-200)*7)));
		}
		
		input.close();
	}

}
