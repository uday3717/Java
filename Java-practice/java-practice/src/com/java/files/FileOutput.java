package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	File f2=new File("D:/Agent1.txt");
	try {
		FileInputStream fi=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);
		int ch;
		while((ch=fi.read())!=-1) {
			fout.write((char)ch);
		}
		fi.close();
		fout.close();
		System.out.println("File Copied Successfully...");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
