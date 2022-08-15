package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;





public class ScreenshotClass 

{	
	private WebDriver driver;
	public  void takeScrenshot(WebDriver driver) throws IOException
	{
		// date and time
		Date d= new Date();
		DateFormat d1=new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String date=d1.format(d);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File dist =new File("H:\\testing 2\\.Study Material\\Screenshot\\Login"+date+".jpg");
		FileHandler.copy(source, dist);
		System.out.println("Screenshot is taken");
	
	}

}
