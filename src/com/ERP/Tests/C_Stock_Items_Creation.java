package com.ERP.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class C_Stock_Items_Creation 
{

	public static void main(String[] args) 
	{
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://webapp.qedgetech.com");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.id("btnreset")).click();
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.id("password")).sendKeys("master");
		Driver.findElement(By.id("btnsubmit")).click();
		
		Driver.findElement(By.linkText("Stock Items")).click();
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Select s=new Select(Driver.findElement(By.id("x_Category")));
		s.selectByVisibleText("thwam");
		
//		Driver.findElement(By.id("x_Category")).sendKeys("thwam");
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Select s1=new Select(Driver.findElement(By.id("x_Supplier_Number")));
		s1.selectByVisibleText("Ahamiham");
		
//		Driver.findElement(By.id("x_Supplier_Number")).sendKeys("Ahamiham");
	
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.findElement(By.id("x_Stock_Name")).sendKeys("Avenger");
		Driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("Anything means one");
		Driver.findElement(By.id("x_Purchasing_Price")).sendKeys("1000");
		Driver.findElement(By.id("x_Selling_Price")).sendKeys("1500");
		Driver.findElement(By.id("x_Notes")).sendKeys("None");
		Driver.findElement(By.id("btnAction")).click();
		
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	}
}
