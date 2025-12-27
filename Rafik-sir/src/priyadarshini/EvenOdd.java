package priyadarshini;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		if(n%2==0) {
			System.out.print("It is even number: "+n);
		}
		else {
			System.out.print("It is odd number: "+n);
		}
		input.close();
	}
}
