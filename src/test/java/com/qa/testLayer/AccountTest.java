package com.qa.testLayer;


//import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.AcciuntCreation;
import com.qa.pageLayer.IndexPage;
import com.qa.pageLayer.MyaccountPage;
import com.qa.pageLayer.RegisterUserAccount;
import com.qa.testbase.Testbase;


//import com.qa.pageLayer.AcciuntCreation;


public class AccountTest extends Testbase
{
	
	@Test
	public void verifyRegistrationAndLogin()
	{
		IndexPage index = new IndexPage ();
		index.clickOnSignIn();
		MyaccountPage account =  new MyaccountPage();
		account.enterEmailaddress("shubhamnanavare864@gmail.com");
		account.clickSubmit();
		
		AcciuntCreation acc = new AcciuntCreation();
				acc.SelectTItleMr();
				acc.EnterFirstName("shubham");
				acc.EnterLastName("Nannavare");
				acc.EnterEmail("");
				acc.EnterPassword("shubham123456");
				acc.Enteraddfirstname("nashik");
				acc.EnteraddLastname("pune");
				acc.EnterAddress("nashik");
				acc.ENterCity("mumbai");
				acc.SelectState("Hawaii");
				acc.Enterpostcode("00000");
				acc.SelectCountry("United States");
				acc.EnterMObileNum("7020465875");
				acc.EnterFutureADD("pune");
				acc.ClickOnRagister();
		RegisterUserAccount register = new RegisterUserAccount ();
	String user =	register.getUserName();
	Assert.assertEquals("shubham Nannavare", user);
	}
	/*@Test
	public void verifyLogin()
	{
		IndexPage index = new IndexPage ();
		index.clickOnSignIn();
		
		MyaccountPage account =  new MyaccountPage();
		account.EnterLoignEmail("shubhamnanavare863@gmail.com");
		account.EnterPasswordLogin("Shubham@123456");;
		account.ClickonSubmitLogin();
		
		RegisterUserAccount register = new RegisterUserAccount ();
		String user =	register.getUserName();
		
		if(user.equals("shubham Nannavare"))
		{
			System.out.println("verify login pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("verify login fail");
			Assert.assertTrue(false);
		}
	}
		*/

}
