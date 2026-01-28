package com.day24.multiThreading;

public class KodEditorApp {
	public static void main(String[] args) {
		KodEditor t1=new KodEditor();
		KodEditor t2=new KodEditor();
		KodEditor t3=new KodEditor();
		
		t1.setName("Type");
		t2.setName("Spell");
		t3.setName("Save");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
class KodEditor extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")) {
			typing();
		}
		else if (tName.equals("Spell")) {
			spellCheck();
		}
		else {
			saving();
		}
		
	}
	void typing() {
		
		for(int i=0; i<10; i++) {
		System.out.println("Hello From Typing1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	void spellCheck() {

		for(; ;) {
			System.out.println("Hello From SpellCheck1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	void saving() {
		for(;;) {
			System.out.println("Hello From Saving1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
}
