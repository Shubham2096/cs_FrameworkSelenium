package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.Addresspage;
import com.qa.pageLayer.IndexPage;
import com.qa.pageLayer.MyaccountPage;
import com.qa.pageLayer.Orderconfirmation;
import com.qa.pageLayer.PaymentPage;
import com.qa.pageLayer.Productpage;
import com.qa.pageLayer.SerchResultPage;
import com.qa.pageLayer.ShippingPage;
import com.qa.pageLayer.SummeryPage;
import com.qa.pageLayer.confirmpage;
import com.qa.testbase.Testbase;

public class BuyItemTest extends Testbase
{
	@Test
	public void VerifyBuyingProduct() throws InterruptedException
	
	{
		IndexPage index = new IndexPage ();
		index.clickOnSignIn();
		MyaccountPage account =  new MyaccountPage();
		account.EnterLoignEmail("shubhamnanvare862@gmail.com");
		account.EnterPasswordLogin("Shubham@123456");;
		account.ClickonSubmitLogin();
		Thread.sleep(3000);
		SerchResultPage serch = new SerchResultPage();
		Thread.sleep(3000);
				serch.enterErchItem("shirt");
				serch.clickserchtab();
				
				Productpage prd = new Productpage ();
				prd.enterQuanity("2");
				prd.ClickonCart();
				prd.clickOnProcedChakout();
				
				SummeryPage sum = new SummeryPage();
						sum.scrollandClickonproced();
						
				Addresspage add  = new Addresspage ();
					add.ClickProcedAccdressCheakout();
					
					
					ShippingPage ship = new ShippingPage ();	
							ship.acceptTermcondition();
					ship.ClickonshippingCheakout();
					
					PaymentPage pay = new PaymentPage ();
					pay.clickonPaymentoption();
					
					confirmpage con = new confirmpage ();
					con.ClickOnConfirmOrder();
			
					Orderconfirmation order = new Orderconfirmation ();
					order.printconfirmMsg();
					
			
					
	}
	
		
}
