package com.java.collectio;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
public static void main(String[] args) {
	Comparator c=new BasicComparator();
	Comparator c1=new NameComparator();
	SortedSet emp=new TreeSet(c1);
	emp.add(new Employ(1, "uday", 25000));
	emp.add(new Employ(2, "joo", 24000));
	emp.add(new Employ(3, "sony", 23000));
	emp.add(new Employ(4, "venky", 22000));
	
	for (Object o : emp) {
		System.out.println(o);
	}

}
}
