package com.myntrajio.ElectronicProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class ElectronicProductTest {
	@Test(groups= {"FT","RT"})

	public void addproduct() {
		Reporter.log("Electronic product Added Sucess", true);
	}

	
	@Test(groups= {"IT","RT"})

	public void removeproduct() {
		Reporter.log("Electronic  product removedSucess", true);
	}


	@Test(groups= {"ST","RT"})

	public void updateproduct() {
		Reporter.log("Electronic  product update success", true);
	}

	

}
