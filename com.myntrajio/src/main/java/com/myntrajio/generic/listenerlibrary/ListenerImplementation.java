package com.myntrajio.generic.listenerlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.commonlibrary.BaseTest;
// Here we use abstraction
public class ListenerImplementation extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
	
		Reporter.log("Taking Screenshot---Start---:" + name + true);
		
		// Step 1 convert the Web driver type object into take Screenshot
		// type(TYPECASTING)
		TakesScreenshot tsref = (TakesScreenshot) webdriverlibrary.static_driver;

		// Step 2 & 3:call the Screen Method and store it in a Temporary path for the
		// Screenshot
		File temp = tsref.getScreenshotAs(OutputType.FILE);

		// step 4: create the permanent path for the Screenshot
		File permanent = new File("./src/test/resources/Screenshot/"+ name +".png");

		// step 5: copy the file from temporary to permanent
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {

			e.printStackTrace();
		}
		Reporter.log("Taking Screenshot--- Completed ---:" + name + true);
	}
}
