package com.myntrajio.generic.javalibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaLibrary {

	
	public String getCurrentTime(int limit) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		return sdf.format(date);
	}
	// This method will pause Script Execution for Specified Time 
	public void pause (long time) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//This method generate random number within specified limit
		public int generateRandomNum(int limit) {
		Random random= new Random();
		return random.nextInt(limit);
		
	}
}
