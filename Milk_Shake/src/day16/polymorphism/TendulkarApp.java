package day16.polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		Tendulkar t=new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();
	}

}
class Tendulkar{
	void job() {
		System.out.println("play cricket");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}
class ArjunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("he is baller");
	}
	void smoke() {
		System.out.println("he smoke some time");
	}
}
