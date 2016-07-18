package com.ERP.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Validation 
{

	public static void main(String[] args) 
	{
	WebDriver Driver = new FirefoxDriver();
	Driver.get("http://webapp.qedgetech.com");
	Driver.manage().window().maximize();
	
	String Expval = "Login";
	
	String Actval = Driver.findElement(By.id("btnsubmit")).getText();
	
	if (Expval.equalsIgnoreCase(Actval))
		{
			System.out.println("Pass");
		} 
	else 
		{
			System.out.println("Fail");
		}
	Driver.close();
	}
}
