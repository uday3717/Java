package com.java.collectio;

import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("uday");
	l.add("bujjy");
	l.add("venky");
	for (Object o : l) {
		System.out.println(o);
	}
	l.addFirst("sony");
	l.addLast("joo");
	System.out.println("updated linked list is:");
	for (Object o : l) {
		System.out.println(o);
	}
}
}
