package com.checked.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionClass {

	public static void main(String[] args) {
		
		File file = new File("file1.txt");

		try {
			FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
