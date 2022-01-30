package com.java.files;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutput {
public static void main(String[] args) {
	File f1=new File("D:/date.txt");
	try {
		FileOutputStream fout=new FileOutputStream(f1);
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject("Date is:");
		out.writeObject(new Date());
		System.out.println("Object Written Successfully...");
		out.close();
		fout.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
