package com.fail.fast;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class FailFast {
	public static void main(String... strings) {
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		
		Enumeration<Integer> enumeration = Collections.enumeration(vector);
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + "\t");
			vector.add(4);
		}
	}
}
