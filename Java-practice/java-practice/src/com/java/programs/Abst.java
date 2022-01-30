package com.java.programs;
abstract class studentdemo{
	abstract void name();
	abstract void email();
}
class uday extends studentdemo{

	@Override
	void name() {
System.out.println("B M Uday Prakash");		
	}

	@Override
	void email() {
System.out.println("udayp43343@gmail.com");		
	}
	
}
class joo extends studentdemo{

	@Override
	void name() {
System.out.println("name is Joo");		
	}

	@Override
	void email() {
System.out.println("joo123@gmail.com");		
	}
	
}
public class Abst {
public static void main(String[] args) {
	/*studentdemo obj=new uday();
	studentdemo obj1=new joo();
	obj.name();
	obj.email();
	System.out.println("---------------------------------");
	obj1.name();
	obj1.email();*/
	
	studentdemo[] arr=new studentdemo[] {
			new uday(),
			new joo()
	};
	for (studentdemo a : arr) {
		a.name();
		a.email();
		System.out.println("---------------------------------");
	}
}
}
