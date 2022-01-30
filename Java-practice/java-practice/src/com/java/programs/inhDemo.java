package com.java.programs;
class First{
	public void show() {
		System.out.println("show method from First class");
	}
}
class Second extends First{
	public void display() {
		System.out.println("display method from Second class");
	}
}
class Third extends Second{					//Multiple inheritance not supported
	public void display() {
		super.display();
		System.out.println("display method from Third class");
	}
}

public class inhDemo {
public static void main(String[] args) {
	Second obj=new Second();
	obj.show();
	obj.display();
	Third obj1=new Third();
	obj1.show();
	obj1.display();
	
}
}
