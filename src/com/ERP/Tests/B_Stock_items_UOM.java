package com.ERP.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B_Stock_items_UOM {

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
		
		Driver.findElement(By.id("mi_a_unit_of_measurement")).click();
		Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		Driver.findElement(By.id("x_UOM_ID")).sendKeys("Aclass1");
		Driver.findElement(By.id("x_UOM_Description")).sendKeys("Anything means one");
		Driver.findElement(By.id("btnAction")).click();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();

	}

}
