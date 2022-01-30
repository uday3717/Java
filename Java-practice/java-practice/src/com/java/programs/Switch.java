package com.java.programs;

import java.security.DomainCombiner;

public class Switch {
	public void switchExample(String a) {
		switch(a) {
		case "Uday":
				System.out.println("this is Uday");
				break;
		default:
			System.out.println("this is dhdsh");
			break;
		case "xyz":
			System.out.println("this is xyz");
			break;
				
		}
		
	}
	public static void main(String[] args) {
		Switch ob=new Switch();
		ob.switchExample("ryuy");
	}

}
