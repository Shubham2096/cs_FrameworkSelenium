package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class PaymentPage extends Testbase
{
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement FinalChekout;
	public void clickonPaymentoption() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("scroll(80,1200)");
		Thread.sleep(3000);
		
		FinalChekout.click();
	}

}
