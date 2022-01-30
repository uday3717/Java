package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectInput {
public static void main(String[] args) {
	File f1=new File("D:/date.txt");
	try {
		FileInputStream fin=new FileInputStream(f1);
		ObjectInputStream in=new ObjectInputStream(fin);
		String s=(String) in.readObject();
		Date d=(Date) in.readObject();
		System.out.println(s+d);
		System.out.println("Object read Successfully...");
		in.close();
		fin.close();
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
