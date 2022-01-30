package com.java.programs;
class abd{
	public void hello() {
		System.out.println("Hi this is Uday...");
	}
	private void password() {
		System.out.println("Password is *****");
	}
	protected void uname() {
		System.out.println("username is user");
		password();
	}
	void finish() {
		System.out.println("ok bye...");
	}
}
public class priv {
public static void main(String[] args) {
	abd obj=new abd();
	obj.hello();
	obj.uname();
	obj.finish();
	
}
}
