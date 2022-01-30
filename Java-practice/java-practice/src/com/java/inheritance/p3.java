package com.java.inheritance;
class uday{
	uday(int age){
		System.out.println("My age is:"+age);
	}
}
class joo extends uday{

	joo(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	
}
public class p3 {
public static void main(String[] args) {
	joo ob=new joo(23);
}
}
