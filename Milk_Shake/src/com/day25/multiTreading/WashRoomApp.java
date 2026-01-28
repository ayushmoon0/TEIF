package com.day25.multiTreading;

public class WashRoomApp {
	public static void main(String[] args) throws InterruptedException {
		Washroom w=new Washroom();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		t1.start();
		t2.start();
		t3.start();
	}
}
class Washroom implements Runnable{

	synchronized public void run() {
		try {
		String tName=Thread.currentThread().getName();
		System.out.println(tName+" is enter in washroom");
			Thread.sleep(3000);
			System.out.println(tName+" is using the washroom");	
			Thread.sleep(3000);
			System.out.println(tName+" is exiting the washroom");	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
