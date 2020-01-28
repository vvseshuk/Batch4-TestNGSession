package com.unimoni.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Two extends Base {
	
	 @Test
	  public void first() {
		  System.out.println("In Two - In test1..");
	  }
	  
	  @Test
	  public void two() {
		  System.out.println("In two - In test2..");
	  }
	  
	  

}
