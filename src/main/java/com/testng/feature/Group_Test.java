package com.testng.feature;

import org.testng.annotations.Test;

public class Group_Test {
	@Test(groups = "Selenium")
	private void selenium1() {
		System.out.println("Login Test");
	}
	@Test(groups = "Api")
	private void api1() {
		System.out.println("Post Test");
	}
	@Test(groups = "Git")
	private void git1() {
		System.out.println("Push Code");
	}
	@Test(groups = "Selenium")
	private void selenium2() {
		System.out.println("Logout Test");
	}
	@Test(groups = "Api")
	private void api2() {
		System.out.println("Pre Test");
	}
	@Test(groups = "Git")
	private void git2() {
		System.out.println("Pop Code");
	}

}
