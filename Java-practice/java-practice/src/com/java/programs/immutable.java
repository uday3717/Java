package com.java.programs;

public class immutable {
public void immu() {
	String a="Uday";
	a.concat(" Prakash");
	System.out.println(a);
	System.out.println(a.concat(" Prakash"));
}
public static void main(String[] args) {
	immutable o=new immutable();
	o.immu();
}
}
