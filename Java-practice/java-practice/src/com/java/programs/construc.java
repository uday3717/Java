package com.java.programs;

public class construc {
static {
	System.out.println("This will be excecuted");
}

public construc() {
	System.out.println("default constructor");
}
public static void main(String[] args) {
	construc obj=new construc();
}
}
