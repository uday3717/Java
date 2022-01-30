package com.java.generics;
class Data<T>{
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value"+a+" B value: "+b);
	}
}
public class SwapDemo {
public static void main(String[] args) {
	Data obj=new Data();
	obj.swap(5, 10);
	obj.swap("Uday","Prakash");
	obj.swap(true,false);

}
}
