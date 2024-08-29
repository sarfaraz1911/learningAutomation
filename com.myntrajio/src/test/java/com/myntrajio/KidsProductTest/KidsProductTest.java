package com.myntrajio.KidsProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)
public class KidsProductTest {


		public void addproduct() {
			Reporter.log("Kids product Added Sucess", true);
		}

		
		@Test(groups= {"IT","RT"})

		public void removeproduct() {
			Reporter.log("kids product removed Sucess", true);
		}


		@Test(groups= {"ST","RT"})

		public void updateproduct() {
			Reporter.log("Kids product update success", true);
		}


	}



