package com.testng.feature;


import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority = 3)
	private void searchWatch() {
		System.out.println("Search Watch");
	}
	
	@Test(priority = 2)
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}
	@Test(priority = -2)
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	@Test(priority = -3)
	private void searchBots() {
		System.out.println("Search Bots");
	}
	@Test
	private void searchAirpods() {
		System.out.println("Search Airpods");
	}


}
