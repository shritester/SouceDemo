package com.SauceDemo.POMClassees;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{	
		//1.intialize/declare WebDriver as private
		//2.find webelement with annotation and declare as private
		//3.create public method with its action on webelement
		//4.create public constructor and pass argument as WebDriver driver
		
		
		private WebDriver driver;
		
		//username
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement username;
		public void sendusername()
		{
			username.sendKeys("standard_user");
		}
		
		//password
		@FindBy(xpath="//input[@id='password']") private WebElement password;
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		// login button
		@FindBy(xpath="//input[@id='login-button']") private WebElement loginbutton;
		public void clickloginbutton()
		{
			loginbutton.click();
		}
		
		
		//constructor
		public LoginPOMClass (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// pom class has no main method so execute all this test class.

}
