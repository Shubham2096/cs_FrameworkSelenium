package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class RegisterUserAccount extends Testbase
{ WebDriver driver;
	public RegisterUserAccount()
	{
		
		PageFactory.initElements(driver, this);
	}

	 // identify web elements 
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement username;
	
	public String getUserName()
	{
	 String text =username.getText();
	return text;
	}
	
}
