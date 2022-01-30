package com.java.programs;

import java.security.DomainCombiner;

public class FactorsOfAno {
public void factors(int n) {
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
}
public static void main(String[] args) {
	FactorsOfAno ob=new FactorsOfAno();
	ob.factors(10);
}

}
