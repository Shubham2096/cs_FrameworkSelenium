package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class Orderconfirmation extends Testbase
{@FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
WebElement confirmmsg;
public void printconfirmMsg()
{

	String confirm =confirmmsg.getText();
	System.out.println(confirm);
	
}


}
