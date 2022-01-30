package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx1 {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	File f2=new File("D:/Agent1.txt");
	try {
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
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
