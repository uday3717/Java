package com.java.programs;

public class Factorial {
	public int fact(int n) {
		int i=1,r=1;
		while(i<=n) {
			r=r*i;
			i++;
		}
		return r;
	}
	public static void main(String[] args) {
		Factorial ob=new Factorial();
		System.out.println(ob.fact(8));
	}

}
