package com.SauceDemo.TestClassees;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.SauceDemo.POMClassees.LoginPOMClass;

public class URLClass 
{
WebDriver driver;
	
	@BeforeTest()
	public void browserdriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Implicit wait is applied");
	}
	
	
	
	
	@BeforeClass
	public void openURL()
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
	}
	
	
	@AfterMethod
	public void teardown()  
	{
		// teardown method name is given to close browser
		driver.close();
		System.out.println("Browser is closed");
	}

	
}
