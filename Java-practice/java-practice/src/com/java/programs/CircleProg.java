package com.java.programs;

public class CircleProg {
	public void area(double a) {
		double are=3.14*a*a;
		double cir=2*3.14*a;
		System.out.println("area of circle is "+are);
		System.out.println("circumference of circle is "+cir);
	}
	public static void main(String[] args) {
		CircleProg ob=new CircleProg();
		ob.area(3);
	}

}
