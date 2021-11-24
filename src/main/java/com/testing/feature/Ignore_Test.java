package com.testing.feature;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test(enabled = false)
	private void searchHeadset() {
		System.out.println("Search Headset");
	}

	@Test
	private void searchMobiles() {
		System.out.println("Search Mobiles");
	}
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
    @Ignore
	@Test
	private void searchBots() {
		System.out.println("Search Bots");
	}
	@Test
	private void searchAirpods() {
		System.out.println("Search Airpods");
	}



}
