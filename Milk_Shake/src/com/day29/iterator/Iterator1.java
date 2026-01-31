package com.day29.iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(175);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
//			al.add(77);
		}
	}
}
