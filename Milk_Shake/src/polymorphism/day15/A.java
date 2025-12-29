package polymorphism.day15;


// Ex-1
/*
public class A{
	public static void main(String[] args) {
		
		JavaTrainer jt=new JavaTrainer();
		AptiTrainer at=new AptiTrainer();
		TestingTrainer tt=new TestingTrainer();
		jt.teach();
		at.teach();
		tt.teach();
		
	}
}

class Trainer {
	void teach() {
		System.out.println("Teaches");
	}
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches java");
	}
}

class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches apti");
	}
}

class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches testing");
	}
}
 
 */


// Ex-2: Perfect Example of Polymorphism
public class A{
	public static void main(String[] args) {
		
		Trainer t;
		t=new JavaTrainer();
		t.teach();
		t=new AptiTrainer();
		t.teach();
		t=new TestingTrainer();
		t.teach();
		
	}
}

class Trainer {
	void teach() {
		System.out.println("Teaches");
	}
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches java");
	}
}

class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches apti");
	}
}

class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("Teaches testing");
	}
}
