package com.java.programs;

public class evenodd {
	void eveodd(int a) {
		if(a%2==0) {
			System.out.println(a +" is even");
		}else {
			System.out.println(a +" is odd");

		}
	}
	public static void main(String[] args) {
		evenodd ob=new evenodd();
		ob.eveodd(5);
		ob.eveodd(6);
		System.out.println();

	}

}
