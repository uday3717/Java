package com.java.programs;
class Employ11 {
	int empno;
	String name;
	double basic;
	
	public Employ11(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ11 [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Sowmya extends Employ11 {

	public Sowmya(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}


class Sakshi extends Employ11 {

	public Sakshi(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class Supcon {
	public static void main(String[] args) {
		Sowmya obj1 = new Sowmya(1, "Sowmya", 99234);
		System.out.println(obj1);
		
		Sakshi obj2 = new Sakshi(3, "Sakshi", 99322);
		System.out.println(obj2);
	}
}

