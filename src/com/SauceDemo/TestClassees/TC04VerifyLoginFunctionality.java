package com.SauceDemo.TestClassees;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassees.HomePOMClass;
import com.SauceDemo.POMClassees.LoginPOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC04VerifyLoginFunctionality extends TC00BaseClass
{
	
	@Test
	public void verifyLoginfunction() throws IOException
	{
				
		// validation
		String exptitle="Swag Labs";
		String acttitle= driver.getTitle();
		
		Assert.assertEquals(acttitle, exptitle, "Title of Home page is not matched");
		
				
		//utility class
		//screenshot
		ScreenshotClass sc=new ScreenshotClass();
		sc.takeScrenshot(driver);
		System.out.println("Screenshot is taken");;
		
		
	}

}
