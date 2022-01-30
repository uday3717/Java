package com.java.programs;

public class StDemos {
public void show() {
	System.out.println("from show method...");
}
public static void display() {
	System.out.println("from display method...");
}
public static void main(String[] args) {
	StDemos obj=new StDemos();
	obj.show();
	StDemos.display();//no object required for calling display method
}
}
