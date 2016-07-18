package com.ERP.masterscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StockAcc_Lib 
{
	//Global declaration
	public static WebDriver driver;
	public static String Eval, Aval;
	
	//creating method
	public String OpenUrl(String Url)
	{
		Eval = "Login";
		
		//open url
		driver=new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
		Aval = driver.findElement(By.id("btnsubmit")).getText();
		
		//validation
		if (Aval.equalsIgnoreCase(Eval))
		{
			//System.out.println("Page opened");
			return "Pass";
		} 
		else 
		{
			//System.out.println("Page Not opened");
			return "Fail";
		}
	}
	
}
