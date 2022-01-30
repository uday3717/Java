package com.java.programs;

public class strFunction {
	public void exam() {
		String a="Uday Prakash";
		System.out.println(a.charAt(0));
		System.out.println(a.compareTo("Uday Prakasi"));
		System.out.println(a.contains("xyz"));
		System.out.println(a.equalsIgnoreCase("UdAy PRAKAsh"));
		System.out.println(a.length());
		System.out.println(a.substring(0, 4));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.equals("agsgsdg"));
	}
public static void main(String[] args) {
	strFunction o=new strFunction();
	o.exam();
}
}
