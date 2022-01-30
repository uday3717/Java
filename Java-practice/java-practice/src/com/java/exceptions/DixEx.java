package com.java.exceptions;

public class DixEx {
public static void main(String[] args) {
	int a,b,c;
	try {	
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[10]);
		c=a/b;
		System.out.println(c);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("division by zero not possible...");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array size is small");
	}catch(NumberFormatException e) {
		System.out.println("expected number but found string...");
	}
}
}
