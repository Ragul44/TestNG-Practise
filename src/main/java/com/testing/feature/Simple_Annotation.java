package com.testing.feature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
	private void setUp() {
		System.out.println("Set Up");
	}

	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");

	}

	@BeforeClass
	private void url() {
		System.out.println("URL");

	}

	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}

	@Test
	private void searchHeadset() {
		System.out.println("Search Headset");
	}

	@Test
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}

	@AfterMethod
	private void verifyHomepage() {
		System.out.println("Verify Homepage");
	}

	@AfterClass
	private void logOut() {
		System.out.println("Log Out");
	}

	@AfterTest
	private void browserClose() {
		System.out.println("Browser Close");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
