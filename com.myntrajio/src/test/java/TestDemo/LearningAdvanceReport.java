package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
	public static void main(String[] args) {

		// Create Object for SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing For The RegisterPage");

		spark.config().setReportName("RegressionSuite");

		spark.config().setTheme(Theme.DARK);

		// Create the Sysytem Information in Extent Report By Attaching
		ExtentReports report = new ExtentReports();

		// Attach the Spark Report and Extend Report
		report.attachReporter(spark);

		// Configure the System Information
		report.setSystemInfo("DeviceName:", "Sarfaraz");
		report.setSystemInfo("OperatingSysytem:", "WINDOWS11");
		report.setSystemInfo("Browser:", "chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-127.0.6533.122");

		// Create the Test Information
		ExtentTest test = report.createTest("Regression test");

		// Steps Information
		test.log(Status.INFO, "Step1:Launching The Browser Succesful");

		test.log(Status.INFO, "Step2:Navigate To Application By Via URL Sucessful");

		test.log(Status.INFO, "Step3:Verified The WebPage Sucessful");

		
		if(true==true) {
		test.log(Status.PASS,"Step4:Verified The WebElement Is Displayed Sucessful");
		}else {
		test.log(Status.FAIL,"Step4:Verified The WebElement Is Not Displayed Sucessful");
		//test.addScreenCaptureFromBase64String(null,"Screenshot Taken->Element Not Displayed");
		}
		
		test.log(Status.SKIP,"Step5:Element Is Hidden");
		
		//Flush the Report Informtion
		report.flush();
		
		
		System.out.println("----->Execution Done<-----");
	}

}
