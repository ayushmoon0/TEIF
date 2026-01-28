package com.day26.collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(25);
		ll.add(75);
		ll.push(22);
		ll.push(23);
	    System.out.println(ll);
	    System.out.println(ll.get(2));
	    
	    LinkedList ll1=new LinkedList();
	    ll1.push(10);
	    ll1.push(20);
	    ll1.push(30);
	    System.out.println(ll1);
	    ll1.pop();
	    System.out.println(ll1);
	    System.out.println(ll1.peek());
	    System.out.println(ll1.peekFirst());
	    System.out.println(ll1.peekLast());
	    System.out.println(ll1);
	    
	    
		

	}

}
