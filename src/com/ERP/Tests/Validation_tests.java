package com.ERP.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_tests 
{
	public static void main(String[] args) 
	{
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://webapp.qedgetech.com");
		
		String Expval="Reset";
		String Actval = Driver.findElement(By.id("btnsubmit")).getText();
		
		if (Expval.equalsIgnoreCase(Actval))
		{
			System.out.println("Available");
		} else 
		{
			System.out.println("Not Available");
		}
		Driver.close();
	}

}
