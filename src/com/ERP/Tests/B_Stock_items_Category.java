package com.ERP.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Stock_items_Category
{

	
	public static void main(String[] args)
	{
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://webapp.qedgetech.com");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.findElement(By.id("btnreset")).click();
		Driver.findElement(By.id("username")).sendKeys("admin");
		Driver.findElement(By.id("password")).sendKeys("master");
		Driver.findElement(By.id("btnsubmit")).click();
		
		Actions act=new Actions(Driver);
		act.moveToElement(Driver.findElement(By.linkText("Stock Items"))).build().perform();

		Driver.findElement(By.id("mi_a_stock_categories")).click();
		Driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		
		Driver.findElement(By.id("x_Category_Name")).sendKeys("thwam");
		Driver.findElement(By.id("btnAction")).click();
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	}

}
