package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ragul\\Videos\\Movies\\Java Class\\TestNG_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	private void flipkart() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ragul\\Videos\\Movies\\Java Class\\TestNG_Concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

	}

}
