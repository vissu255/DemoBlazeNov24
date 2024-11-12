package com.qa.demoblaze.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demoblaze.factory.DriverFactory;
import com.qa.demoblaze.pages.IndexPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected IndexPage indexPage;

	
	@BeforeTest
	public void setUp() {
         df = new DriverFactory();
         driver = df.initDriver("chrome");
         indexPage = new IndexPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
