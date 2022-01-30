package com.java.programs;

public class overloading {
public void sum(int x){
	System.out.println("sum method w.r.t integer "+x);
}
public void sum(String x){
	System.out.println("sum method w.r.t string "+x);
}
public void sum(double x){
	System.out.println("sum method w.r.t double "+x);
}
public void sum(boolean x){
	System.out.println("sum method w.r.t boolean "+x);
}
public static void main(String[] args) {
	overloading obj=new overloading();
	obj.sum(5);
	obj.sum("Uday");
	obj.sum(3.556);
	obj.sum(false);
}
}
