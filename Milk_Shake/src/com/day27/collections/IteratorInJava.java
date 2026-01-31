package com.day27.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorInJava {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		String s="arsh";
		Iterator itr=al.descendingIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
