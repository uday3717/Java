package com.java.collectio;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employ e1=(Employ) o1;
		Employ e2=(Employ) o2;
		return e2.getName().compareTo(e1.getName());
	}

}
