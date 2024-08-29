package com.myntrajio.generic.propertyfilelibrary;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

import com.myntrajio.generic.commonlibrary.FrameWorkConstant;

public class ReadPropertyfile implements FrameWorkConstant {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	Properties property = null;

	public String readData(String key) {
		//Step 1: create an object of FileInputStream--->
		// Converting physical file into java understandable
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step 2:create an object for properties class
		Properties property = new Properties();

		// Step 3:load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Step 4:fetch the data by calling getproperty()
		String data = property.getProperty(key);

		return data;
	}

	public void WriteData(String key, String value) {

		//Step 5: enter the data
		property.put(key, value);

		// Step 6:create instance for FILE Output Stream

		try {
			fos = new FileOutputStream(propertypath);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step 7:store the data
		try {
			property.store(fos, "Updated the key-value Sucessfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Step 8:fetch the data by calling getproperty()
		String data = property.getProperty(key);

		// Step 9:Display tha Data
		Reporter.log(key + ":" + data, true);
	}

	public void displayData(String key) {
		// create an object of FileInputStream--->
		// Converting physical file into java understandable
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// create an object for properties class
		Properties property = new Properties();

		// load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// fetch the data by calling getproperty()
		String data = property.getProperty(key);

		// Display tha Data
		Reporter.log(key + ":" + data, true);
	}

}
