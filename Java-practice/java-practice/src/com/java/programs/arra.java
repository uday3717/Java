package com.java.programs;

public class arra {
public void xyz() {
	//int [] a=new int[] {1,2,3,4,5};
	int a[]=new int[]{1,2,3,4,5};
	//int b[]=new[] int{1,2,3,4,5};//wrong declaration
	/*
	 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
	 */
	for (int i : a) {
		System.out.println(i);
	}
	System.out.println(a.length);
}
public static void main(String[] args) {
arra obj=new arra();
obj.xyz();
}
}
