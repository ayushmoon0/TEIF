package com.day29.iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		
		al.add(100);
		al.add(50);
		al.add(80);
		al.add(70);
		al.add(90);
		al.add(20);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			al.add(77);
		}
		System.out.println(al);
		Iterator itr1=al.iterator();
		while(itr1.hasNext()){
			System.out.print(itr1.next()+" ");
		}
	}
	
}
