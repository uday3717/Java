package com.java.programs;

public class Boxempstu {
public void box(Object o) {
	String a=o.getClass().getSimpleName();
	if(a.equalsIgnoreCase("Employ")) {
		Employ e=(Employ) o;
		System.out.println("employ name is: "+e.name);
		System.out.println("employ id is: "+e.empno);
		System.out.println("employ basic is: "+e.basic);

	}
	if(a.equalsIgnoreCase("Student")) {
		Student s=(Student) o;
		System.out.println("student name is: "+s.name);
		System.out.println("student id is: "+ s.sno);
		System.out.println("student cgp is: "+s.cgp);

	}
	
	
}
public static void main(String[] args) {
	Employ e=new Employ();
	e.empno=1;
	e.basic=45000;
	e.name="Anil";
	Student s=new Student();
	s.sno=1;
	s.name="Uday";
	s.cgp=8.12;
	Boxempstu obj=new Boxempstu();
	obj.box(e);
	System.out.println("-----------------------------------------");
	obj.box(s);
}
}
