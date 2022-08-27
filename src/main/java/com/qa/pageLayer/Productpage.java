package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class Productpage extends Testbase
{
	@FindBy(id="quantity_wanted")
	WebElement enterQuantity;
	public void enterQuanity(String qty)
	{enterQuantity.clear();
		enterQuantity.sendKeys(qty);
	}
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement addcart;
	public void ClickonCart()
	{
		addcart.click();
	}
	@FindBy(linkText="Proceed to checkout")
	WebElement cheakout;
	public void clickOnProcedChakout()
	{
		cheakout.click();
	}
}
