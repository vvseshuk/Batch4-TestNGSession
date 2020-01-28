package com.unimoni.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionEx {
	
	@Test
	public void test() {
		System.out.println("I am here..");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Hi","Hello");
		System.out.println("after soft assertion..");
		softAssert.assertAll();
		System.out.println("After assert all..");
	}

}
