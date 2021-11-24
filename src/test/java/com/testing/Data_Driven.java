package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Driven {
	
		@Test(dataProvider = "logInData")
		private void login(@Optional("Ragulsekar")   String username, String password) {
			System.out.println("Enter Login Details");
			System.out.println("Username :" + username);
			System.out.println("Password :" + password);
			
	}
		@DataProvider
		private Object[][] logInData() {
			return new Object[][] {
				{"AAA","111"},
				{"BBB","211"},
				{"CCC","311"},
			};

		}
}
