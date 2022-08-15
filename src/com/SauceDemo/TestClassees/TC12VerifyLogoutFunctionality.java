package com.SauceDemo.TestClassees;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.POMClassees.HomePOMClass;
import com.SauceDemo.POMClassees.LoginPOMClass;

public class TC12VerifyLogoutFunctionality extends TC00BaseClass
{
	@Test
	public void verifyLogoutFunctionality()
	{
		
		//homepage -----> menu button, logout
		//create object of SoucePOMHome
		HomePOMClass hp= new HomePOMClass (driver);
		hp.clickmenu();
		System.out.println("clicked on main menu");
		hp.clicklogout();
		System.out.println("clicked on logout button");
		
		// validation
		String expectedtitle ="Swag Labs";
		String acttitle=driver.getTitle();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(acttitle, expectedtitle);
		
		
		
		
		
	
	}

}
