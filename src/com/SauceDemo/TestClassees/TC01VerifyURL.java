
package com.SauceDemo.TestClassees;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassees.LoginPOMClass;

public class TC01VerifyURL  extends URLClass
{ 
	
	@Test
	public void VerifyURL()
	{
		LoginPOMClass lp= new LoginPOMClass(driver);
		String exppagetitle= "Swag Labs";
		String actpagetitle=driver.getTitle();
		
		// validation
		Assert.assertEquals(actpagetitle, exppagetitle,"URL is not working");
	
	}
	
	
	
	
	
	
	
	
	
	

}
