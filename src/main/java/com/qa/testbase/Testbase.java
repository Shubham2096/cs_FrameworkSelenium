package com.qa.testbase;


import java.time.Duration;



//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


/*import com.qa.pageLayer.Dashboard;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.TradingPage;*/

/*import com.qa.pageLayer.Dashboard;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.TradingPage;*/



public class Testbase {
	public static WebDriver driver;
	//public static Logger logger;
	
	/*public LoginPage login;
	public Dashboard dash;
	public TradingPage trade;*/
	
	
	
	@BeforeMethod
	public void setUp()
	{
		 String br = "chrome";              
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			// logger.info("Chrome launches"); 
		 }
		 else if (br.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Please provide valid browser name");
		 }
		 
		 driver.get("http://automationpractice.com/index.php");
		// logger.info("url launches");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		// logger.info("maximized browser");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// logger.info("provided waits");
		 
		/* login = new LoginPage();
		 dash = new Dashboard();
		 trade = new TradingPage();*/
		 
		 
		//login.enterEmailAddress("amarwaghmare573@gmail.com");
	//	login.enterPassword("Test@1234");
	//	login.clickOnLoginButton();
			//--------------------------------
		
	
	
}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
