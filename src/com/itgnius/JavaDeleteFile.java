package com.itgnius;

import java.io.File;

public class JavaDeleteFile {

	public static void main(String[] args) {

		// Java Read current path
		String current_path = System.getProperty("user.dir");

		try {
			File file = new File(current_path+"/dataFile/test.txt");

			// §” —Ëß≈∫‰ø≈Ï
			if (file.delete()) {
				System.out.println("Delete file success");
			} else {
				System.out.println("Delete file fail");
			}

		} catch (Exception e) {
			System.out.println("Error delete file");
		}

	}

}
