package com.java.files;

import java.io.File;

public class FileDemo {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	System.out.println(f1.getName());
	System.out.println(f1.getParent());
	System.out.println("path:"+f1.getPath());
}
}
