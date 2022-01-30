package com.java.collectio;

import java.util.ArrayList;
import java.util.List;

public class arrlis {
public static void main(String[] args) {
	List numbers=new ArrayList();
	numbers.add(1);
	numbers.add(5);
	numbers.add(5);
	numbers.add(1);
	int sum=0;
	for (Object o : numbers) {
		sum+= (int) o;
	}
	System.out.println(sum);

}
}
