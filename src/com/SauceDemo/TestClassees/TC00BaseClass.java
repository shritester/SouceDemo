package com.SauceDemo.TestClassees;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClassees.LoginPOMClass;

public class TC00BaseClass 
{
	WebDriver driver;
	
	@Parameters ("BrowserName")
	@BeforeMethod
	public void Browser(String BrowserName)
	{
		if(BrowserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", 
					"H:\\Testing\\edgedriver_win64\\msedgedriver.exe");
			
			 driver = new EdgeDriver();
		}
		else	
		{
			System.setProperty("webdriver.chrome.driver",
				"H:\\Testing\\chromedriver_win32\\chromedriver.exe");
		
			driver= new ChromeDriver();
		}
		
		
	}
	
	@BeforeMethod
	public void setup()
	{
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Implicit wait is applied");
		
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
	
		
}
