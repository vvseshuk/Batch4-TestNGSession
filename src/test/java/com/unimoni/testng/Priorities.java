package com.unimoni.testng;

import org.testng.annotations.Test;

public class Priorities {
	@Test(priority = 1)
	public void login() {
		System.out.println("Logged in..");
	}
	
	@Test(priority = 0)
	public void dispatch() {
		System.out.println("Dispatched..");
	}
	
	@Test(priority = 2)
	public void checkout() {
		System.out.println("Checked out..");
	}

}
