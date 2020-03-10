package com.itgnius;

import java.io.BufferedReader;
import java.io.FileReader;

public class JavaReadFile {

	private static BufferedReader in;

	public static void main(String[] args) {

		// Java Read current path
		String current_path = System.getProperty("user.dir");

		try {
			in = new BufferedReader(new FileReader(current_path+"/dataFile/data.txt"));
			// สร้างตัวแปรสำหรับพักข้อมูล
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("Error read file");
		}

	}

}
