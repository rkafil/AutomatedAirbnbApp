package com.qa.ActionFeatures;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetup {

		WebDriver driver;
		
		@BeforeSuite
		public void setup() {
		//Setup Chrome driver
			WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","/Users/bia/Desktop/chromedriver");
		  driver = new ChromeDriver();
		
		}
		
		
		@BeforeTest
		public void launchCareersPage() {
			
			driver.get("https://careers.airbnb.com/");
		}
		
		
		@AfterTest
		public void quitAll() {
			//driver.quit();
		}
		
		

	

}
