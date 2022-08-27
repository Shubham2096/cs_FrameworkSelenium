package com.qa.utility;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


import com.qa.testbase.Testbase;





	public class UtilClass extends Testbase {
		
		static String path = "C:\\Users\\hp\\Desktop\\Software Testing\\April09SwagLab\\screenshot";
		
		public static void takeSS(String filename)
		{
			try 
			{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File des = new File(path+filename+".png");
				FileHandler.copy(src, des);
			} 
			catch (IOException e) 
			{
				System.out.println("File is not found");
			}
			
		}

	}


