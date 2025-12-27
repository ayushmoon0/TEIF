package priyadarshini.day5;

import java.util.HashSet;
import java.util.Set;

public class EmailRegistration {
	public static void main(String[] args) {
		Set<String> email = new HashSet<>();
		
		email.add("user1@gmail.com");
		email.add("user2@gmail.com");
		email.add("user3@gmail.com");
		email.add("user2@gmail.com");
		
		
		System.out.println("Registered Mails: ");
		System.out.println();
		for(String s : email) {
			System.out.println(s);
		}
	}
}
