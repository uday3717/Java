package com.java.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
public void dateToString(String s) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date dt=sdf.parse(s);
	System.out.println(dt);
}
public static void main(String[] args) {
	String dt="12-05-1999";
	DateEx2 obj=new DateEx2();
	try {
		obj.dateToString(dt);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
