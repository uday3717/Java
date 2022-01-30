package com.java.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
public static void main(String[] args) {
	Date obj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	System.out.println(sdf.format(obj));
	
}
}
