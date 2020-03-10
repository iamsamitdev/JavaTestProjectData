package com.itgnius;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		
		// Java Read current path
		String current_path = System.getProperty("user.dir");
				
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(current_path+"/dataFile/country.csv"))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Code=" + country[4] + " , Country=" + country[5]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
