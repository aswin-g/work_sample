package com.poncho.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

public class CSVRecords2HashMap {


public static HashMap getRecordsHashMap(String relativePath) throws ParseException, IOException {
	String path = System.getProperty("user.dir")+relativePath;
	System.out.println("PATH = "+path);
	
    BufferedReader br = new BufferedReader(new FileReader(path));
    String line =  null;
    HashMap<String,String> map = new HashMap<String, String>();

    while((line=br.readLine())!=null){
        String str[] = line.split(",");
        for(int i=0;i<str.length;i++){
            String arr[] = str[i].split(":");
            System.out.println(map);
            map.put(arr[0], arr[1]);
        }
    }
    System.out.println(map);
	return map;
 }
}