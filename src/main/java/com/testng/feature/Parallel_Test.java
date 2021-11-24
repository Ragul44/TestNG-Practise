package com.testng.feature;

import org.testng.annotations.Test;

public class Parallel_Test {
	@Test
	private void searchLaptops() {
          System.out.println("Search Laptops");
	}
	@Test(invocationCount = 4)
	private void searchFruits() {
           System.out.println("Search Fruits");
	}
	@Test(invocationCount = 7)
	private void searchMobiles() {
         System.out.println("Search Mobiles");
	}
}
