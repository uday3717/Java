package com.java.nested;
class a{
	private int a=0;
	class b{
		public void info() {
			System.out.println("Hi I am inner class");
			System.out.println(a);
		}
	}
	public void call_inner_class() {
		b obj=new b();
		obj.info();
	}
}
public class innerclass {
public static void main(String[] args) {
	a obj1=new a();
	obj1.call_inner_class();
}
}
