package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class Addresspage  extends Testbase
{
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
	WebElement AddChek;
	public void ClickProcedAccdressCheakout()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("scroll(80,1200)");
		Thread.sleep(3000);
		AddChek.click();
	}
}
