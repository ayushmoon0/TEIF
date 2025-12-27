package priyadarshini.day3;

public class ResultValidation {
	
	static void checkMarks(int marks) throws Exception {
		if(marks<0 || marks>100) throw new Exception("Invalid Marks..");
		else {
			System.out.println("Pass/Fail");
		}
	}
	public static void main(String[] args) {
		try {
			checkMarks(101);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
