package com.qa.ActionFeatures;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;






public class NavigateCareersPage extends BaseSetup {
	
	@Test 
	public void verifyAndClickRoles() throws InterruptedException {
		
		//JS executor for scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
		//Verify an "explore roles" button exists, then click it
		WebElement rolesBtn = driver.findElement(By.xpath("//*[@id=\'main\']/div[1]/div[3]/a"));
		
		if(rolesBtn.isDisplayed()) {
			System.out.println("Explore Roles btn is found.");
			rolesBtn.click();
		} else 
			System.out.println("Explore Roles btn NOT found.");
		
		
		//Find locations drop down and select 'SF' if it exists
		WebElement locationDD = driver.findElement(By.xpath("//*[contains(text(), 'All Locations')]"));
		wait.until(ExpectedConditions.visibilityOf(locationDD));
		locationDD.click();
		
		WebElement SFoption = driver.findElement(By.xpath("//*[contains(text(), 'San Francisco')]"));
		if(SFoption.isDisplayed()) {
			System.out.println("SF option is found.");
			SFoption.click();
		} else 
			System.out.println("SF option NOT found.");
		
		//Find and select 'engineering' if it exists from departments options
		WebElement departmentsBtn = driver.findElement(By.xpath("//*[@id=\"preact-widget-airbnb-jobs\"]/div/div[2]/div[1]/div/ul/li[10]/button"));
		wait.until(ExpectedConditions.visibilityOf(departmentsBtn));
		if(departmentsBtn.isDisplayed()) {
			System.out.println("Engineering option is found.");
			departmentsBtn.click();
		} else 
			System.out.println("Engineering option NOT found.");
		
		//Find first available engineering role, click it
		WebElement SWErole = driver.findElement(By.xpath("//*[@id=\'preact-widget-airbnb-jobs\']/div/div[2]/div[2]/div/ul/li[1]/a/h3"));
		wait.until(ExpectedConditions.visibilityOf(SWErole));
		if(SWErole.isDisplayed()) {
			System.out.println("SWE role is found.");
			SWErole.click();
		} else 
			System.out.println("SWE role NOT found.");
		
		//Scroll page, then click 'Apply now'
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Role overview')]")));
		WebElement applyBtn = driver.findElement(By.xpath("//*[contains(text(), 'Apply now')]"));
		
		if(applyBtn.isDisplayed()) {
			System.out.println("Apply button is found.");
			js.executeScript("arguments[0].scrollIntoView();", applyBtn);
			applyBtn.click();
		} else 
			System.out.println("Apply button NOT found.");
		
		WebElement iframeElement = driver.findElement(By.id("grnhse_iframe"));
		
		driver.switchTo().frame(iframeElement);
		
		//First Name input box
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		wait.until(ExpectedConditions.visibilityOf(firstName));
		if(firstName.isDisplayed()) {
			System.out.println("First name input box is found.");
			firstName.sendKeys("John");
		} else 
			System.out.println("First name input box NOT found.");
		
		//Last Name input box
		WebElement lastName = driver.findElement(By.xpath("//*[@id='last_name']"));
		wait.until(ExpectedConditions.visibilityOf(lastName));
		if(lastName.isDisplayed()) {
			System.out.println("Last name input box is found.");
			lastName.sendKeys("Doe");
		} else 
			System.out.println("Last name input box NOT found.");
		
		//Email input box
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		wait.until(ExpectedConditions.visibilityOf(email));
		if(email.isDisplayed()) {
			System.out.println("Email input box is found.");
			email.sendKeys("John.Doe@outlook.com");
		} else 
			System.out.println("Email input box NOT found.");
		
		//Phone input box
		WebElement phone = driver.findElement(By.xpath("//*[@id='phone']"));
		wait.until(ExpectedConditions.visibilityOf(phone));
		if(phone.isDisplayed()) {
			System.out.println("Phone input box is found.");
			phone.sendKeys("5105551234");
		} else 
			System.out.println("Phone input box NOT found.");
		
		
		//City input box 
		WebElement city = driver.findElement(By.xpath("//*[@id='auto_complete_input']"));
		wait.until(ExpectedConditions.visibilityOf(city));
		if(city.isDisplayed()) {
			System.out.println("City input box is found.");
			city.sendKeys("South San Francisco, California, United States");
		} else 
			System.out.println("City input box NOT found.");
		
		//Attach Resume 
		WebElement resume = driver.findElement(By.xpath("//*[@id='resume_fieldset']/div/div[3]/button[1]"));
		wait.until(ExpectedConditions.visibilityOf(resume));
		if(resume.isDisplayed()) {
			System.out.println("Resume btn is found.");
			resume.sendKeys("/Users/bia/Desktop/JohnDoeResume.pdf");
		} else 
			System.out.println("Resume btn NOT found.");
		
		
		//Job question input box 
		WebElement jobQuestion = driver.findElement(By.xpath("//*[@id=\'job_application_answers_attributes_0_text_value\']"));
		wait.until(ExpectedConditions.visibilityOf(jobQuestion));
		if(jobQuestion.isDisplayed()) {
				System.out.println("Job question input box is found.");
				jobQuestion.sendKeys("Linkedin");
		} else 
			System.out.println("Job question input box NOT found.");
		
		
		//Visa input box 
		WebElement visa = driver.findElement(By.xpath("//*[@id=\'job_application_answers_attributes_1_boolean_value\']"));
		wait.until(ExpectedConditions.visibilityOf(visa));
		if(visa.isDisplayed()) {
				System.out.println("Visa question input box is found.");
				visa.sendKeys("No");
		} else 
			System.out.println("Visa question input box NOT found.");
		
		
		
		
		
	}


}
