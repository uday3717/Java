package com.java.files;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	try {
		FileOutputStream fout=new FileOutputStream(f1);
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(5);
		dout.writeUTF("Uday...");
		dout.writeDouble(3.5);
		dout.writeBoolean(false);
		System.out.println("Data Written Successfully...");
		dout.close();
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
