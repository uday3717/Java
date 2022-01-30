package com.java.programs;
class abc{
	public void show() {
		System.out.println("show method w.r.t abc class");
	}
}
class xyz extends abc{
	public void show() {
		super.show();
		System.out.println("show method w.r.t xyz class");
	}
}
public class SupDemo {
public static void main(String[] args) {
	xyz obj=new xyz();
	obj.show();
}
}
