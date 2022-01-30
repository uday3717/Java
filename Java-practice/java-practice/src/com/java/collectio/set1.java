package com.java.collectio;

import java.util.HashSet;
import java.util.Set;

public class set1 {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("Uday");
	s.add("joo");
	s.add("sony");
	s.add("venky");
	s.add("sony");
	s.add("joo");
	s.add("bujjy");
	for (Object o : s) {
		System.out.println(o);
	}
}
}
