package com.java.files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class DataInput {
public static void main(String[] args) {
	File f1=new File("D:/Agent.txt");
	try {
		FileInputStream	fi = new FileInputStream(f1);
		DataInputStream din=new DataInputStream(fi);
		System.out.println("The primitive contents of the 'Agent' file is:");
		int x=din.readInt();
		System.out.println(x);
		String s=din.readUTF();
		System.out.println(s);
		Double d=din.readDouble();
		System.out.println(d);
		Boolean b=din.readBoolean();
		System.out.println(b);
		din.close();
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
