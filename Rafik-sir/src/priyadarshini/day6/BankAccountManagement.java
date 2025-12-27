package priyadarshini.day6;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManagement {
	public static void main(String[] args) {
		Map<Integer, String> accounts = new HashMap<>();
		
		accounts.put(1001, "ayush");
		accounts.put(1002, "harsh");
		accounts.put(1003, "monish");
		accounts.put(1004, "pajwal");
		
		System.out.println("Account Details: ");
		
		
		for(Map.Entry<Integer, String> i : accounts.entrySet()) {
			System.out.println("Account No.: "+i.getKey()+" Name: "+i.getValue());
		}
		System.out.println();
		System.out.println("Account 1003 holder Name: "+accounts.get(1003));
	}
}
