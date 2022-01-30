package com.java.collectio;

import java.util.ArrayList;
import java.util.List;

public class EmployList {
public static void main(String[] args) {
	List emplist=new ArrayList();
	emplist.add(new Employ(1, "xyz", 1234));
	emplist.add(new Employ(2, "abc", 1234));
	emplist.add(new Employ(3, "pqr", 1234));
	for (Object o : emplist) {
		Employ e=(Employ) o;
		System.out.println(e);
	}

}
}
