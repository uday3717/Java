package com.java.exceptions;
enum WeekDays{
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday
}
public class EnumEx {
public static void main(String[] args) {
	WeekDays obj=WeekDays.Monday;
	System.out.println(obj);
	String val="January";
	/*
	 * WeekDays wd1=WeekDays.valueOf(val); System.out.println(wd1);
	 */
}
}
