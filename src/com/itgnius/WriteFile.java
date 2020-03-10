package com.itgnius;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try{
			// Java Read current path
			String current_path = System.getProperty("user.dir");
			
            BufferedWriter out = new BufferedWriter(new FileWriter(current_path+ "/dataFile/data.txt"));
            out.write("Samit Koyom\r\n");
            out.write("IT Genius Engineering\r\n");
            out.write("Training solution\r\n");
            out.write("สวัสดีภาษาไทย");
            out.close();
            
            System.out.println("Write file success");
        }catch(IOException e){
            e.printStackTrace();
        }

	}

}
