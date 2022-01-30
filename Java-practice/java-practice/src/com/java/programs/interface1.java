package com.java.programs;
interface Training{
	abstract void student();
	abstract void email();
}
class uday1 implements Training{

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("name is Uday");
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("email is 'udayp43343@gmail.com'");
	}
	
}
class anand implements Training{

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("name is Anand");
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("email is 'anand@gmail.com'");
	}
	
}
public class interface1 {
public static void main(String[] args) {
	Training[] arry=new Training[] {
			new uday1(),
			new anand()
	};
	for (Training t : arry) {
		t.student();
		t.email();
	}
}
}
