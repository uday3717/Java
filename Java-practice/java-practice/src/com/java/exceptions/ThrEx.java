package com.java.exceptions;

public class ThrEx {
public void exec(int x) {
	if(x<0) {
		throw new ArithmeticException("Number can't be less than 0...");
	}else if(x==0) {
		throw new NumberFormatException("zero is invalid...");
	}else {
		System.out.println(x);
	}
}
public static void main(String[] args) {
	ThrEx obj=new ThrEx();
	try {
		obj.exec(-5);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(NumberFormatException e) {
		e.printStackTrace();
	}
}
}
