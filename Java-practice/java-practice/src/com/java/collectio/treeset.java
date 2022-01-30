package com.java.collectio;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add("uday");
	s.add("joo");
	s.add("sony");
	s.add("venky");
	s.add("bujjy");
	for (Object o : s) {
		System.out.println(o);
	}
}
}
