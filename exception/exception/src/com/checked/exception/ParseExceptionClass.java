package com.checked.exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ParseExceptionClass {

	public static void main(String[] args) {
		try {

			DateFormat df = DateFormat.getInstance();
			Date d = new Date(10000000000L);
			String str = df.format(d);
			Date d2 = df.parse(str);
			System.out.println(d2);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
