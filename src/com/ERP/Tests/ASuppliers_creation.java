package com.ERP.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ASuppliers_creation 
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
	
	Driver.findElement(By.linkText("Suppliers")).click();
	Driver.findElement(By.xpath(".//a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
	Driver.findElement(By.id("x_Supplier_Name")).sendKeys("Ahamiham");
	Driver.findElement(By.id("x_Address")).sendKeys("Nowhere");
	Driver.findElement(By.id("x_City")).sendKeys("Hyderabad");
	Driver.findElement(By.id("x_Country")).sendKeys("India");
	Driver.findElement(By.id("x_Contact_Person")).sendKeys("iham");
	Driver.findElement(By.id("x_Phone_Number")).sendKeys("8880000888");
	Driver.findElement(By.id("x__Email")).sendKeys("ihamaham@ymail.com");
	Driver.findElement(By.id("x_Mobile_Number")).sendKeys("8880000888");
	Driver.findElement(By.id("x_Notes")).sendKeys("None");
	Driver.findElement(By.id("btnAction")).click();
	Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	}
}
