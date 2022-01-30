package com.java.exceptions;

public class Arrex {
public static void main(String[] args) {
	int[] a=new int[] {1,2};
	System.out.println(a.length);
	try {
		a[20]=100;
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		System.out.println("array size is small");
	}
}
}
