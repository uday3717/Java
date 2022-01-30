package com.java.programs;

public class Contest {
int a,b;

public Contest() {
	a=0;
	b=0;
}
public Contest(int a,int b) {
this.a=a;
this.b=b;
}
public static void main(String[] args) {
	Contest obj=new Contest();
	System.out.println("sum is "+obj.sum());
}
private int sum() {
	// TODO Auto-generated method stub
	return a+b;
}
}
