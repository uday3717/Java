package com.java.collectio;

import java.util.ArrayList;
import java.util.List;

public class lis {
public static void main(String[] args) {
	List names=new ArrayList();
	names.add("Uday");
	names.add("Harish");
	names.add("Gowraj");
for (Object o : names) {
	System.out.println(o);
}
names.add(2,"Bhanu");
System.out.println("new list is:");
for (Object o : names) {
	System.out.println(o);
}
names.set(2, "praveen");
//names.add(0, "Joo");
names.remove(0);
System.out.println("Updated list is:");
for (Object o : names) {
	System.out.println(o);
}
}
}
