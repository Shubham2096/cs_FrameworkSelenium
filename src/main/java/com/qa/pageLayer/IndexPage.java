package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.testbase.Testbase;

public class IndexPage extends Testbase
{

	// create  object of webdriver

	public IndexPage()
	{
		
		PageFactory.initElements(driver, this);
	}

	 // identify web elements 
	@FindBy(linkText="Sign in")
	WebElement sign_in;
	
	// identify action on web element
	
	public void clickOnSignIn()
	{
		sign_in.click();
	}
	

	
	

}
