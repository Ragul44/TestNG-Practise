package com.testng.feature;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test(expectedExceptions = Exception.class)
	private void test() {
             int i =10/0;
	}

}
