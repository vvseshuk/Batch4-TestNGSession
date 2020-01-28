package com.unimoni.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProviderEx {

	private WebDriver driver;

	@Test(dataProvider = "dp")
	public void positive(String uid, String pwd) {
		driver.findElement(By.name("uid")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		String title = driver.getTitle();
		assertEquals(title, "Guru99 Bank Manager HomePage");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { "mngr243008", "UdUvyre" }, 
			new Object[] { "mngr243008", "UdUvyre" }, 
			};
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
