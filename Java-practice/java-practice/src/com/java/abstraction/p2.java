package com.java.abstraction;
abstract class a{
	abstract void name();
	abstract void email();
}
class b extends a{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("name is: 'Uday'");
	}

	@Override
	void email() {
		// TODO Auto-generated method stub
		System.out.println("email is: 'Udayp43343@gmail.com'");

	}
	
}
public class p2 {
public static void main(String[] args) {
	a ob=new b();
	ob.name();
	ob.email();
}
}
