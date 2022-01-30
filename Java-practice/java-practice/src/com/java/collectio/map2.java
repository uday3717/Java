package com.java.collectio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map2 {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("uday", "prakash");
	m.put("bujjy", "kumar");
	m.put("joo", "sony");
	System.out.println("enter username & password:");
	Scanner sc=new Scanner(System.in);
String username=sc.next();
String pass=sc.next();
String res=(String) m.getOrDefault(username, "Not found");
if(res.equalsIgnoreCase(pass)) {
	System.out.println("correct credentials...");
}else {
	System.out.println("wrong credentials...");
}

}
}
