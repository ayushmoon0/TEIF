package priyadarshini.day3;


class Account{
	static String BankName = "SBI";
	static float IR = 4.5f;
	int accNo;
	String holderName;
	
	Account(int accNo,String holderName){
		this.accNo=accNo;
		this.holderName=holderName;
	}
}

class SavingsAcc extends Account{
	final String accountType="SAVINGS";
	SavingsAcc(int accNo, String holderName){
		super(accNo,holderName);
	}
	void display() {
		System.out.println("Bank: "+BankName);
		System.out.println("Account Holder: "+holderName);
		System.out.println("Account No.: "+accNo);
		System.out.println("Interest Rate: "+IR+"%");
	}
}
class CurrentAcc extends Account{
	final String accountType="CURRENT";
	CurrentAcc(int accNo, String holderName){
		super(accNo,holderName);
	}
	void display() {
		System.out.println("Bank: "+BankName);
		System.out.println("Account Holder: "+holderName);
		System.out.println("Account No.: "+accNo);
		System.out.println("Interest Rate: "+IR);
	}
}
public class BankManagement {
	
	public static void main(String[] args) {
		
		CurrentAcc c1 = new CurrentAcc(101,"Ayush");
		c1.display();
		SavingsAcc s1 = new SavingsAcc(102,"Parimal");
		System.out.println();
		s1.display();
	}
}
