package com.java.programs;

public class stat {
static int i;
public void incr() {
	i++;
	
}
public void show() {
	System.out.println(i);
}
public static void main(String[] args) {
	stat obj=new stat();
	obj.show();
	obj.incr();
	obj.incr();
	obj.incr();
	obj.incr();
obj.show();
}
}
