package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInpu {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	try {
		FileInputStream fi=new FileInputStream(f1);
		int ch;
		while((ch=fi.read())!=-1) {
			System.out.println((char)ch);
		}
		fi.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
