package com.java.nested;
class Outer_Demo {
	   // private variable of the outer class
	   private int num = 175;  
	   
	   // inner class
	   public class Inner_Demo {
	      public int getNum() {
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	   }
	}
public class nested2 {
public static void main(String[] args) {
	Outer_Demo obj=new Outer_Demo();
	Outer_Demo.Inner_Demo inner=obj.new Inner_Demo();
System.out.println(	inner.getNum());
}
}
