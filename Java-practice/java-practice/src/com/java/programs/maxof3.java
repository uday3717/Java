package com.java.programs;

public class maxof3 {
public void max(int a,int b,int c) {
	/*
	 * if(a>b) { if(a>c) { System.out.println(a); }else { System.out.println(c); }
	 * }else { if(b>c) { System.out.println(b); }else { System.out.println(c); } }
	 */
	int max=a;
	if(max<b) {
		max=b;
	}
	if(max<c) {
		max=c;
	}
	System.out.println(max);
}
public static void main(String[] args) {
	maxof3 obj=new maxof3();
	obj.max(1,3,2);
	String s="hello";
	System.out.println(s.concat(" "));
	System.out.println(s.concat(" World"));

}
}
