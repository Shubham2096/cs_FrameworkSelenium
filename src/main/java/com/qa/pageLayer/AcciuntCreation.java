package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.Testbase;

public class AcciuntCreation extends Testbase
{
	
	public AcciuntCreation ()
	{
		
		PageFactory.initElements(driver, this);
	}

	 // identify web elements 
	@FindBy(id="id_gender1")
	WebElement titleMr;
	
	public void SelectTItleMr()
	{
		titleMr.click();
	}
	
	@FindBy(id="customer_firstname")
	WebElement custfirstname;
	
	public void EnterFirstName(String name)
	{
		custfirstname.sendKeys(name);
	}
	
	@FindBy(id="customer_lastname")
	WebElement custLastaname;
	
	public void EnterLastName(String lastname)
	{
		custLastaname.sendKeys(lastname);
	}
	
	@FindBy(id="email")
	WebElement email;
	public void EnterEmail(String useremail)
	{
		email.sendKeys(useremail);
	}
	
	
	@FindBy(id="passwd")
	WebElement password;
	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	@FindBy(id="firstname")
	WebElement addfirstname1;
	public void Enteraddfirstname(String addfirstname)
	{
		addfirstname1.sendKeys(addfirstname);
	}
	
	
	@FindBy(id="lastname")
	WebElement addlastname;
	public void EnteraddLastname(String addlastname1)
	{
		addlastname.sendKeys(addlastname1);
	}
	@FindBy(id="address1")
	WebElement address;
	public void EnterAddress(String add)
	{
		address.sendKeys(add);
	}
	
	@FindBy(id="city")
	WebElement city;
	public void ENterCity(String cityname)
	{
		city.sendKeys(cityname);
	}
	
	
	@FindBy(id="id_state")
	WebElement State;
	public void SelectState(String text)
	{
		Select s = new Select (State);
		s.selectByVisibleText(text);
	}
	
	@FindBy(id="postcode")
	WebElement postcode;
	public void Enterpostcode(String code)
	{
		postcode.sendKeys(code);
	}
	
	@FindBy(id="id_country")
	WebElement country;
	public void SelectCountry(String text)
	{
		Select c = new Select (country);
				c.selectByVisibleText(text);
	}
	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	public void EnterMObileNum(String mobilenum)
	{
		mobile.sendKeys(mobilenum);
	}
	
	@FindBy(id="alias")
	WebElement futureadd;
	public void EnterFutureADD(String futureadd1)
	{
		futureadd.sendKeys(futureadd1);
	}
	
	@FindBy(id="submitAccount")
	WebElement submit;
	public void ClickOnRagister()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
