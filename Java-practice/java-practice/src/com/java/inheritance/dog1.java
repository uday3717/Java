package com.java.inheritance;
interface Animal1{}
class Mammal1 implements Animal1{}
public class dog1 extends Mammal1 {
	public static void main(String args[]) {
		Mammal1 m = new Mammal1();
		dog1 d = new dog1();
		System.out.println(m instanceof Animal1);
		System.out.println(d instanceof Mammal1);
		System.out.println(d instanceof Animal1);
	}
}
