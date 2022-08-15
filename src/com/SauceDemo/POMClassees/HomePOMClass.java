package com.SauceDemo.POMClassees;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	private WebDriver driver;
	private Actions act; // for mouse action, its object created in constructor
	private Select s; //  to handle dropdown, create object in constuctor
	
	//inspect all the web elements are present on homepage
	
	//Menu button
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement menu;
	public void clickmenu()
	{
		//menu.click();
		act.click(menu).perform();  // mouse action click
	}
	//all items button in menu
	@FindBy(xpath="//a[text()='All Items']") private WebElement allitem;
	public void clickallitem()
	{
		allitem.click();
	}
	
	//About button in main menu
	@FindBy(xpath="//a[text()='About']") private WebElement about;
	public void clickabout()
	{
		about.click();
	}
	
	//Logout button in main menu
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	public void clicklogout()
	{
		logout.click();
	}
	
	// Reset App state in main menu
	@FindBy(xpath="//a[text()='Reset App State']") private WebElement resetapp;
	public void clickresetapp()
	{
		resetapp.click();
	}
	
	//shopping cart 
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement shoppingcart;
	public void clickshoppingcart()
	{
		shoppingcart.click();
	}
	// method to extract qty of product are added in shopping cart
	public String verifyshoppingcart()
	{
		String quantity =shoppingcart.getText();
		return quantity;
	}
	
	// Add multiple products in Shopping cart
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']") private List<WebElement> allproducts;

	public void  clickallproducts()
	{
		for (WebElement
				product:allproducts)
		{
			product.click();
		System.out.println("All product added in addtocart");
		}	
	 
	}
		
	// single product add to cart 
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addtocart;
	public void clickaddtocart()
	{
		addtocart.click();
	}
	
	// mutiple product are add tocart
//	for (int i=0; i<addtocart.getSize(); i++)
//	{
//		
//	}
	
	// remove form cart
	@FindBy(xpath="//button[text()='Remove']") private WebElement remove;
	public void clickremove()
	{
		remove.click();
	}
	
	//Filter 
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement filter;
	public void clickfilter()
	{
		filter.click();
		s.selectByVisibleText("Price (low to high)");
	}
	
	
	
	

	//constructor with WebDriver driver as a argument
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		act=new Actions (driver);  //object of mouse Action class
		
		s=new Select(filter);  //filter dropdown handle
	}
	
	
	
	
}
