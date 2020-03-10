package com.itgnius;

import java.io.File;

public class JavaFile {

	public static void main(String[] args) {

		// Java Read current path
		String current_path = System.getProperty("user.dir");

		// Java Create new file
		try {
			File file = new File(current_path + "/dataFile/data.txt");
			if (file.createNewFile()) {
				System.out.println("File Create Success");
			} else {
				System.out.println("Error file already exists");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
