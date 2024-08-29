package com.myntrajio.RegisterTest;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class RegisterTest extends BaseTest {
	@Test
	public void registervalidata() {
		// Waiting Statement
		javalibrary.pause(9000);

		// Step 1: Verify the Register Page
		Assert.assertEquals("title", "title", "Verified Register Page");

		// Step 2: Verify the Element
		Assert.assertEquals("element", "element", "Verified WebElement");

		// --->Create an object for Registration page<---
		RegisterPage regpage = new RegisterPage(webdriverlibrary.driver);

		// Step 3: Perform Action--clear
		regpage.getNametextfeild().clear();

		// Step 4: Perform Action--Name
		regpage.getNametextfeild().sendKeys("khan");

		// Step 5: Perform Action--Email
		regpage.getEmailtextfeild().sendKeys("khan1234@gmail.com");

		// step 6: perform action -- Password
		regpage.getPasswordtextfeild().sendKeys("abc123");

		// Waiting Statement
		javalibrary.pause(9000);

		// Step 6: Perform Action--Enter mobile no
		regpage.getMobiletextfeild().sendKeys("8850925255");

		// Waiting Statement
		javalibrary.pause(9000);

		// step 7: perform Action --gender-->Female
		regpage.getgender().click();

		// Waiting Statement
		javalibrary.pause(9000);

		regpage.getFeedbacktextfeild().sendKeys("Selenium");

		javalibrary.pause(9000);

		Reporter.log("Register with Valid Data Sucess", true);
	}
}