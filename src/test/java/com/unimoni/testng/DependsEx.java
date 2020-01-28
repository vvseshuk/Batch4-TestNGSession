package com.unimoni.testng;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DependsEx {
	
	 @Test
	  public void first() {
		  System.out.println("In test1..");
	  }
	  
	  @Test
	  public void two() {
		  System.out.println("In test2..");
		  assertFalse(true, "Want to fail this test");
	  }
	  
	  @Test(dependsOnMethods = "two")
	  public void third() {
		  System.out.println("In test1..");
	  }
	

}
