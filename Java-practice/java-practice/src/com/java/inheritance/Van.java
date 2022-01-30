package com.java.inheritance;
 class Vehicle{

	Vehicle() {
		System.out.println("Vehicle type is Van");
	}
	 
 }
class Speed{
	Speed(){
		System.out.println("drive slowly...");
	}
	void limit() {
		System.out.println("depends on the NH no...");
	}
}
public class Van extends Vehicle {
private Speed speed;
public static void main(String[] args) {
	Van ob=new Van();
}
}
