package priyadarshini;

import java.util.Scanner;

public class LoginValid {
	public static void main(String[] args) {
		String uname = "ayush";
		String pass = "hello123";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input.nextLine();
		System.out.println("Enter password: ");
		String password = input.nextLine();
		if(username.equals(uname) && password.equals(pass)) {
			System.out.println("U are logged in Successfully..!!");
		}
		else {
			System.out.println("Plz enter valid credentials..");
		}
		input.close();
	}
}
