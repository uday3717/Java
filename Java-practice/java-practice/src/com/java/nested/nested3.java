package com.java.nested;
class d{
	public void method_class() {
		class e{
			public void iam() {
				System.out.println("I am a class inside a method...");
			}
		}
		e obj=new e();
		obj.iam();
	}
}
public class nested3 {
public static void main(String[] args) {
	d obj=new d();
	obj.method_class();
}
}
