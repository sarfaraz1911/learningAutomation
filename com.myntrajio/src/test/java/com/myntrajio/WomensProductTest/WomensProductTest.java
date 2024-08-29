package com.myntrajio.WomensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class WomensProductTest {
	

		public void addproduct() {
			Reporter.log("Womens product Added Sucess", true);
		}

		@Test(groups = { "IT", "RT" })

		public void removeproduct() {
			Reporter.log(" Womens product removed  Sucess", true);
		}

		@Test(groups = { "ST", "RT" })

		public void updateproduct() {
			Reporter.log("Womens  product update success", true);
		}

	}


