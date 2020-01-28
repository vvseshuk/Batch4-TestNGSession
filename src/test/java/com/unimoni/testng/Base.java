package com.unimoni.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

}
