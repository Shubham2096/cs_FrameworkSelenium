package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class ShippingPage extends Testbase
{
	@FindBy(id="cgv")
	WebElement markteak;
	public void acceptTermcondition()
	{
		
		markteak.click();
	}
	
	
	@FindBy(xpath="//button[@class=\"button btn btn-default standard-checkout button-medium\"]")
	WebElement shippcheak;
	public void ClickonshippingCheakout()
	{
		
		shippcheak.click();
	}
	
}
