package com.java.collectio;

import java.util.LinkedHashSet;
import java.util.Set;

public class set2 {
public static void main(String[] args) {
	Set s=new LinkedHashSet();
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
