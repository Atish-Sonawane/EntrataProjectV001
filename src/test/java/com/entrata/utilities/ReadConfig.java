package com.entrata.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

// Below class are used to make configuration with config.properties file and fetching all the data from that.

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		
		// Path of config.properties file
		File src = new File("./Configuration/config.properties");
		
		//read and load the data using FileInputStream and load class
		try {
			pro=new Properties();
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		} catch(Exception e){                                     //use to handle unexpected or exceptional situations.
			System.out.println("Exception is:"+ e.getMessage());
		}
	}
	
	//Fetch data from property file and stored in below methods
	
	public String getBrowserName() {
		String browser = pro.getProperty("browser");
		return browser;
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}



}
