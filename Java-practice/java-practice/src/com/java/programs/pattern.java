package com.java.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
public static void main(String[] args) {
	String re="\\d";
	String tex="J";
	Pattern pt=Pattern.compile(re);
	Matcher mt=pt.matcher(tex);
	boolean result=mt.matches();
	System.out.println(result);
}
}
