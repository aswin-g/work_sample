package com.poncho.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CSVFileRead {
	public  CSVParser getCSVParser(String absolutePath) {
		
			String path = System.getProperty("user.dir")+absolutePath;
			System.out.println("PATH = "+path);
			
			BufferedReader fileReader = null;
		    CSVParser csvParser = null;
		    
		    try {
		      fileReader = new BufferedReader(new FileReader(path));
		      csvParser = new CSVParser(fileReader,
		          CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
		 
		      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
		      
		      for (CSVRecord record : csvRecords) {
		    	  
		    	  System.out.println("Record #: " + record.getRecordNumber());
			        System.out.println("First Name: " + record.get("Customer_First_Name"));
			        System.out.println("Last Name: " + record.get("Customer_Last_Name"));
			        System.out.println("Car1 Rego#: " + record.get("Car1_Registration_Number"));
			        System.out.println("Car1 Rego State: " + record.get("Car1_Registered_State"));
			        
		      }
		 
		    } catch (Exception e) {
		      System.out.println("Reading CSV Error!");
		      e.printStackTrace();
		    } finally {
		      try {
		        fileReader.close();
		        csvParser.close();
		      } catch (IOException e) {
		        System.out.println("Closing fileReader/csvParser Error!");
		        e.printStackTrace();
		      }
		    }
			return csvParser;
	}
}
