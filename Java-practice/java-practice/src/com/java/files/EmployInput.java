package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployInput {
public static void main(String[] args) {
	File f1=new File("D:/Employ.txt");
	try {
		FileInputStream fout=new FileInputStream(f1);
		ObjectInputStream out=new ObjectInputStream(fout);
		Employ e=(Employ) out.readObject();
		System.out.println(e);
		System.out.println("employ object read Successfully...");
		out.close();
		fout.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
