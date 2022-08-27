package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.Testbase;

public class SerchResultPage extends Testbase
{
	//serch object
		@FindBy(id="search_query_top")
		WebElement serch_tab;
		public void enterErchItem(String item)
		{
			serch_tab.sendKeys(item);
		}
		
		@FindBy(xpath="//button[@name='submit_search']")
		WebElement clickserch_tab;
		public void clickserchtab( )
		{
			clickserch_tab.click();
		}
		
		
		
		@FindBy(xpath="//img[@class='replace-2x img-responsive']")
		WebElement Items_selct;
		public void selectItem(String shirt)
		{
			Actions act = new Actions (driver);
			act.moveToElement(Items_selct).perform();
		}
		
		@FindBy(xpath="//span[contains(text(),'More')]")
		WebElement select_more;
		public void ClickOnmoreOption()
		{
			select_more.click();
		}
}
