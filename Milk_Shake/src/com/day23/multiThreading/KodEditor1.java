package com.day23.multiThreading;

public class KodEditor1 {
	public static void main(String[] args) throws InterruptedException {
		for(;;) {
			System.out.println("hello");
		}
//		System.out.println("Application started....");
//		Thread t1= new Thread(new Typing1());
//		Thread t2 = new Thread(new Saving1());
//		Thread t3 = new Thread(new SpellCheck1());
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		t1.join();
//		t2.join();
//		t3.join();
//		System.out.println("Application Terminated...");
	}
}

class Typing1 implements Runnable{

	@Override
	 public void run() {
		System.out.println("Typing started....");
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
		System.out.println("Hello From Typing1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("Typing Terminated...");
	}
	
}
class SpellCheck1 implements Runnable{

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		System.out.println("SpellCheck started....");
		for(int i=0; i<10; i++) {
			System.out.println("Hello From SpellCheck1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		System.out.println("SpellCheck Terminated...");
	}


}
class Saving1 implements Runnable{
	
	@Override
	 public void run() {
		System.out.println("Saving started....");
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Hello From Saving1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		System.out.println("Saving Terminated...");
	}
	
}






//                     OR Using static method


/*

public class KodEditor1 {
	public static void main(String[] args) {
	duty(new Thread(new Typing1()));
	duty(new Thread(new Saving1()));
	duty(new Thread(new SpellCheck1()));
		
	}
	static void duty(Thread t) {
		t.start();
	}
}

class Typing1 implements Runnable{

	@Override
	 public void run() {
		
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
		System.out.println("Hello From Typing1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}

class Saving1 implements Runnable{

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Hello From Saving1");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}
	
}

class SpellCheck1 implements Runnable{

	@Override
	 public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Hello From SpellCheck1");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}
}

*/
