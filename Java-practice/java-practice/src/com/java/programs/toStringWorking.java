package com.java.programs;

public class toStringWorking {
public static void main(String[] args) {
	Employ e=new Employ(3, "haresh", 45000);
	Employ e1=new Employ();
	e1.empno=2;
	e1.name="Kohli";
	e1.basic=27000;
	System.out.println(e);
	System.out.println(e1);
	System.out.println("---------------------------------");
	Employ[] err=new Employ[] {
			new Employ(5, "xyz", 10),
			new Employ(6, "abc", 11)
	};
	for (Employ ea : err) {
		System.out.println(ea);
		System.out.println("================================");
	}
}
}
