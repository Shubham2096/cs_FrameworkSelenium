package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class SummeryPage extends Testbase
{
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	WebElement proced;
	public void scrollandClickonproced() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("scroll(80,1200)");
		Thread.sleep(3000);
		proced.click();
	}
}
