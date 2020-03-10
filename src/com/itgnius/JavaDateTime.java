package com.itgnius;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateTime {
	public static void main(String[] args) {
		
		// Date function
		// Date date = new Date();
		// System.out.println(date.toString());
		
		// Format date function
		String pattern = "EEEEE d MMMMM yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String dNow = simpleDateFormat.format(new Date());
		System.out.println(dNow);
	}
}
