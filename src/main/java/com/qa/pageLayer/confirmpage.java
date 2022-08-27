package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class confirmpage 
{
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement confirmorder;
	public void ClickOnConfirmOrder()
	{
	
		confirmorder.click();
	}
}
