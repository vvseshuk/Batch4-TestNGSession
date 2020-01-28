package com.unimoni.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {

	@BeforeMethod(alwaysRun = true, onlyForGroups = { "regression" })
	public void before() {
		System.out.println("before..regression..");
	}

	@BeforeMethod(alwaysRun = true, onlyForGroups = { "functional" })
	public void before1() {
		System.out.println("before functional..");
	}

	@BeforeMethod(alwaysRun = true, onlyForGroups = { "smoke" })
	public void before2() {
		System.out.println("before smoke..");
	}

	@AfterMethod(alwaysRun = true, onlyForGroups = { "regression" })
	public void after() {
		System.out.println("after..regression..");
	}

	@AfterMethod(alwaysRun = true, onlyForGroups = { "functional" })
	public void after1() {
		System.out.println("after functional..");
	}

	@AfterMethod(alwaysRun = true, onlyForGroups = { "smoke" })
	public void after2() {
		System.out.println("after smoke..");
	}
	
	@Test(groups = { "functional", "smoke" })
	public void login() {
		System.out.println("Logged in..");
	}

	@Test(groups = { "functional" })
	public void dispatch() {
		System.out.println("Dispatched..");
	}

	@Test(groups = { "regression" })
	public void checkout() {
		System.out.println("Checked out..");
	}
}
