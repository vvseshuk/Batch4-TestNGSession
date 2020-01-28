package com.unimoni.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumFirst {
	
	private WebDriver driver;
	
	@Test
	public void positive() {
		driver.findElement(By.name("uid")).sendKeys("mngr243008");
		driver.findElement(By.name("password")).sendKeys("UdUvyre");
		driver.findElement(By.name("btnLogin")).click();
		String title = driver.getTitle();
		assertEquals(title, "Guru99 Bank Manager HomePage");
		
	}
	
	@Test
	public void negative() {
		driver.findElement(By.name("uid")).sendKeys("mngr243008");
		driver.findElement(By.name("password")).sendKeys("UdUvyres");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		assertNotEquals(title, "Guru99 Bank Manager HomePage");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/index.php");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {	
		Thread.sleep(3000);
		driver.quit();
	}

}
