package com.java.programs;
interface training1{
	void name();
}
interface training2{
	void email();
}
class sachin implements training1,training2{

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("name is: sachin");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("email is:sachin @gmail.com");
	}
	
}
public class interface2 {
public static void main(String[] args) {
	sachin obj=new sachin();
	obj.name();
	obj.email();
}
}
