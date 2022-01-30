package com.java.collectio;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class map1 {
public static void main(String[] args) {
	Map m=new Hashtable();
	m.put(1, "Uday");
	m.put(2, "Prakash");
	m.put(3, "Sony");
	m.put(4, "Joo");
	System.out.println("enter employe no:");
	Scanner sc=new Scanner(System.in);
	int empno=sc.nextInt();
		String name=(String) m.getOrDefault(empno, "Not Found");
	System.out.println(name);
}
}
