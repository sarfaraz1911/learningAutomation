package com.myntrajio.generic.PageRepository;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {

		// Intilaize the page
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "name")
	private WebElement nametextfeild;

	@FindBy(id = "email")
	private WebElement emailtextfeild;

	@FindBy(id = "password")
	private WebElement passwordtextfeild;

	@FindBy(id = "mobile")
	private WebElement mobiletextfeild;

	@FindBy(id = "female")
	private WebElement gender;

	@FindBy(id = "feedback")
	private WebElement feedbacktextfeild;

	public WebElement getNametextfeild() {
		return nametextfeild;
	}

	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}

	public WebElement getPasswordtextfeild() {
		return passwordtextfeild;
	}

	public WebElement getMobiletextfeild() {
		return mobiletextfeild;
	}

	public WebElement getgender() {
		return gender;
	}

	public WebElement getFeedbacktextfeild() {
		return feedbacktextfeild;
	}

}
