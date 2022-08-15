package com.SauceDemo.TestClassees;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassees.HomePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC14VerifyMultipleAddtocart extends TC00BaseClass

{
	@Test
	public void verifymultipleproductaddtocart() throws IOException
	{
		//create object
		
		HomePOMClass hp= new HomePOMClass(driver);
		hp.clickallproducts();
		System.out.println("clicked on Add to Cart of All Products");
		
		ScreenshotClass sc=new ScreenshotClass();
		sc.takeScrenshot(driver);
		System.out.println("Screenshot is taken");;
		
		//Validation
		hp.clickshoppingcart();
		
		//Verify multiple products are added in art or not
		String actqtyshopcart= hp.verifyshoppingcart();
		String expqtyshopcart ="6";
		
		Assert.assertEquals(actqtyshopcart, expqtyshopcart);
		
		
		
		}
	
	
	
}
