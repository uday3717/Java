package com.java.exceptions;

import java.util.Scanner;

public class Emplyinpu {
public static void main(String[] args) {
	Employ obj=new Employ();
	System.out.println("enter employee number:");
	Scanner sc=new Scanner(System.in);
	obj.setEmpno(sc.nextInt());
	System.out.println("enter employee name:");
	obj.setName(sc.next());
	System.out.println("enter employee Gender:");
	String gen=sc.next();
	if(gen.equalsIgnoreCase("male")) {
		obj.setGender(Gender.Male);
	}else {
		obj.setGender(Gender.Female);
	}
	System.out.println("enter employee department:");
	obj.setDept(sc.next());
	System.out.println("enter employee designation:");
	obj.setDesig(sc.next());
	System.out.println(obj);
}
}
