package com.java.collectio;

import java.util.Comparator;

public class BasicComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employ e1=(Employ) o1;
		Employ e2=(Employ) o2;
		if(e1.getBasic()>=e2.getBasic()) {
			return -1;
		}else {
			return 1;
		}

	}

}
