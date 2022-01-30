package com.java.programs;
class methods{
	protected void Uday() {
		System.out.println("This is Uday");
	}
	public void Harish() {
			System.out.println("This is Harish");
		}
}
public class demo {
	public static void main(String[] args) {
		methods obj=new methods();
		obj.Uday();
		obj.Harish();
	}
}



