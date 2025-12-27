package priyadarshini.day3;

import java.util.Scanner;

public class LoginValidation {
	static void authenticate (String user, String pass) throws Exception {
		String username = "ayush";
		String password = "123a";
		if(user.equals(username) && pass.equals(password)) {
			System.out.println("Login Sucess.!!");
		}
		else {
			throw new Exception("Invalid-->> Check Entered Details: ");
		}
	}
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String user = input.nextLine();
		System.out.print("Enter password: ");
		String pass = input.nextLine();
		
		try {
			authenticate(user, pass); 
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		finally {
			input.close();
			System.out.println("Resources closed..");
		}
	}
	}
