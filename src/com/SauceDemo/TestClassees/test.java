package com.SauceDemo.TestClassees;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassees.LoginPOMClass;

public class test {

	
	
WebDriver driver;
	
	@BeforeClass
	public void Browserdriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"H:\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Implicit wait is applied");
		
	}
	
	@BeforeMethod
	public void setup()
	{
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		//login activity --> username,password,loginbuttion
		//LoginPOMClass object created
		LoginPOMClass log=new LoginPOMClass (driver);
		log.sendusername();
		System.out.println("username is entered");
		
		log.sendpassword();
		System.out.println("password is entered");
		log.clickloginbutton();
		System.out.println("clicked on login button");
		
	}
	
	@AfterMethod
	public void teardown()  
	{
		// teardown method name is given to close browser
		driver.close();
		System.out.println("Browser is closed");
	}
	
	
	private Actions act; // for mouse action, its object created in constructor
	private Select s; //  to handle dropdown, create object in constuctor

	@Test
	public void test()
	{
		
	}
	
	
	
	
	
	
	
	
}
