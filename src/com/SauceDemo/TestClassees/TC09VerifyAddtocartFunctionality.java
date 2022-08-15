package com.SauceDemo.TestClassees;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClassees.HomePOMClass;
import com.SauceDemo.POMClassees.LoginPOMClass;

public class TC09VerifyAddtocartFunctionality extends TC00BaseClass
{
	//WebDriver driver;  // no need here
	@Test
	public void verifyaddtocartfunctionality() throws InterruptedException 
	{
 		
		//Home Page--. add cart and remove 
		HomePOMClass hp= new HomePOMClass (driver);
		hp.clickaddtocart();
		System.out.println("product added in cart");
		//Thread.sleep(3000);
		
		//shopping cart
		// validation ==> verifying only one product is added in cart
		String actcartqty= hp.verifyshoppingcart();
		String expcartqty="1";
		
		System.out.println("Products added in cart:"+actcartqty);
		
		Assert.assertEquals(actcartqty, expcartqty, "Actual Qty in shooping cart is not matched");
		
				
		hp.clickremove();
		System.out.println("Product removed form cart");
		
//		hp.clickallproducts();
//		
//		String actaddedproduct=hp.verifyshoppingcart();
//		System.out.println("Added products in cart:" +actaddedproduct);
//		String expaddedproduct="6";
//		
//		if(actaddedproduct.equals(expaddedproduct))
//		{
//			System.out.println("All product are added sucessfully:Test case is passed");
//		}
//		else
//		{
//			System.out.println("Allproducts are added sucessfully:test case is failed");
//		}
		
		
	
	}

}
