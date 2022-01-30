package com.java.programs;

public class Boxing_Unboxing {
public void boxing() {
	int a=1;
	String b="Uday";
	double c=3.5;
	Object o1,o2,o3;
	o1=a;
	o2=b;
	o3=c;
	System.out.println(o1);
	System.out.println(o2);
	System.out.println(o3);
}
public void Unboxing() {
	Object o1,o2,o3;
	o1=1;
	o2="Uday";
	o3=3.556;
	int a=(int) o1;
	String b=(String) o2;
	double c=(double) o3;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}
public static void main(String[] args) {
	Boxing_Unboxing o=new Boxing_Unboxing();
	o.boxing();
	o.Unboxing();
}
}
