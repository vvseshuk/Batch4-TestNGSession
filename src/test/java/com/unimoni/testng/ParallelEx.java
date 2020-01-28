package com.unimoni.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParallelEx extends BaseTest {
	
	@Test
	public void googleSearch_one() throws InterruptedException {
		WebElement element = getDriver().findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ESCAPE);

		WebElement search = getDriver().findElement(By.name("btnK"));
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		
	}
	
	
	
	

}
