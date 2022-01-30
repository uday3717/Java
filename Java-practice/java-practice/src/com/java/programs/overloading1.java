package com.java.programs;

public class overloading1 {
public int sum() {
	return 5;
	
}
public int sum(int x) {
	return 5+x;
	
}
public int sum(int x,int y) {
	return x+y;
	
}
public static void main(String[] args) {
	overloading1 obj=new overloading1();
	System.out.println(obj.sum());
	System.out.println(obj.sum(5));
	System.out.println(obj.sum(5,10));

}
}
