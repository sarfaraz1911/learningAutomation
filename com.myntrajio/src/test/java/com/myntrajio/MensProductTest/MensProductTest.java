package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class MensProductTest {

	

		public void addproduct() {
			Reporter.log("Mens product Added Sucess", true);
		}

		
		@Test(groups= {"IT","RT"})

		public void removeproduct() {
			Reporter.log("Mens product removed Sucess", true);
		}


		@Test(groups= {"ST","RT"})

		public void updateproduct() {
			Reporter.log("Mens product update success", true);
		}


	}



