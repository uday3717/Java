package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenList {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("ab");
	names.add("abc");
	names.add("abcd");
	//names.add(1);
for (String s : names) {
	System.out.println(s);
}
	
}
}
