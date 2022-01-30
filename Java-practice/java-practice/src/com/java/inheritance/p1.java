package com.java.inheritance;
class calculation{
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public void subtraction(int a,int b) {
		System.out.println(a-b);
	}
}
class calculation1 extends calculation{
	public void multiplication(int a,int b) {
		System.out.println(a*b);
	}
}
public class p1 {
public static void main(String[] args) {
	calculation1 ob=new calculation1();
	calculation obj=new calculation();
	ob.addition(10,5);
	ob.subtraction(10, 5);
	ob.multiplication(10, 5);
	//obj.multiplication(); not allowed 
}
}
