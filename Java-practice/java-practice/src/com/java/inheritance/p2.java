package com.java.inheritance;
class superclass{
	public void display() {
		System.out.println("display method w.r.t. super class...");
	}
}
class subclass extends superclass{
	public void display() {
		System.out.println("display method w.r.t. sub class...");
	}
	public void invoke() {
		display();
		super.display();
	}
}
public class p2 {
public static void main(String[] args) {
	subclass ob=new subclass();
	ob.invoke();
}
}
