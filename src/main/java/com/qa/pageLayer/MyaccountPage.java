package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class MyaccountPage extends Testbase
{


	// create  object of webdriver
	
	public MyaccountPage()
	{
	
		PageFactory.initElements(driver, this);
	}

	 // identify web elements 
	@FindBy(id="email_create")
	WebElement createEmailId;
	
	public void enterEmailaddress(String Email)
	{
		createEmailId.sendKeys(Email);
	}
	
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;
	
	public void clickSubmit()
	{
		SubmitCreate.click();
	}
	
	@FindBy(id="email")
	WebElement EmailLogin;
	public void EnterLoignEmail(String mail)
	{
		EmailLogin.sendKeys(mail);
	}
	
	
	@FindBy(id="passwd")
	WebElement PasswdLogin;
	public void EnterPasswordLogin(String passwd)
	{
		PasswdLogin.sendKeys(passwd);
	}
	
	@FindBy(id="SubmitLogin")
	WebElement Submitlogin;
	public void ClickonSubmitLogin()
	{
		Submitlogin.click();
	}
	@FindBy(id="search_query_top")
	WebElement serch_tab;
	public void enterErchItem(String item)
	{
		serch_tab.sendKeys(item);
	}
	

}
