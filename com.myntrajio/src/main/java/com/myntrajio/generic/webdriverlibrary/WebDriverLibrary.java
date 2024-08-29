package com.myntrajio.generic.webdriverlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverLibrary {
	public WebDriver driver;
	public static WebDriver static_driver;
	public Action action;
	public Select select;

	/**
	 * This Method Launches Specified browser
	 *
	 * @param browser
	 */

	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":

			driver = new ChromeDriver();
			static_driver = driver;
			break;
		case "firefox":

			driver = new FirefoxDriver();
			static_driver = driver;
			break;
		case "edge":

			driver = new EdgeDriver();
			static_driver = driver;
			break;
		default:
			System.out.println("Invalid Browser Info");

		}
		return driver;

	}

	// Maximize the browser
	public void maximizBrowser() {
		driver.manage().window().maximize();
	}

	/**
	 * This method is useed to navigate to the application
	 * 
	 * @param url
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}

	public void waitUntilElementFound(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	public void explicitWait(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void closeWindow() {
		driver.close();

	}

	public void quitAllWindow() {
		driver.quit();
	}

}
