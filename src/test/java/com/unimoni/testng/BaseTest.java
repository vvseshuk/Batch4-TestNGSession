package com.unimoni.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	private WebDriver driver;
	
	@Parameters({ "browser" })
	@BeforeTest
	public void init(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Title:" + driver.getTitle());

	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	

}
