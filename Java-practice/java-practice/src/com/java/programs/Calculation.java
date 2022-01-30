package com.java.programs;

public class Calculation {
	void multiply(int a,int b) {
		int c=a*b;
		System.out.println("result is:"+c);
	}
	public static void main(String[] args) {
		Calculation ob=new Calculation();
		ob.multiply(5,10);
	}

}
