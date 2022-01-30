package com.java.programs;

public class BoxingExam {
	public void ab(Object o) {
		System.out.println(o.getClass());
		String name=o.getClass().getSimpleName();
		if(name.equalsIgnoreCase("String")) {
			System.out.println(name);
			String a=(String) o;
			System.out.println(a);
		}else if(name.equalsIgnoreCase("double")) {
			System.out.println(name);
			double b=(double) o;
			System.out.println(b);
		}else {
			System.out.println(name);
			int c=(int) o;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		int a=1;
		String b="Uday";
		double c=3.5;
		BoxingExam obj=new BoxingExam();
		obj.ab(a);
		obj.ab(b);
		obj.ab(c);

	}

}
