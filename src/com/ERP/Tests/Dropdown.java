package com.ERP.Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		//driver.manage().window().maximize();
	
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.id("mi_a_purchases")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		
		driver.findElement(By.id("x_Purchase_Date")).clear();
		driver.findElement(By.xpath(".//*[@class='input-group-btn']")).click();
		
		/*Select s = new Select(driver.findElement(By.xpath(".//*[@class='button cnav']")));
		s.selectByVisibleText("19");
		driver.findElement(By.xpath(".//*[@class='button cnav']")).click();*/
		
		Select s = new Select(driver.findElement(By.id("x_Supplier_ID")));
		s.selectByVisibleText("iham");
		
		driver.findElement(By.id("x_Notes")).sendKeys("hello.......");
		driver.findElement(By.id("btnCancel")).click();
		
		List<WebElement> wb = driver.findElements(By.xpath(".//*[@class='ajs-button btn btn-primary']"));
		int c = wb.size();
		for (int i = 0; i < c; i++) 
		{
			wb.get(i).click();
			break;
		}
		driver.findElement(By.id("mi_logout")).click();
		
		/*driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		
		Select s = new Select(driver.findElement(By.id("x_Supplier_ID")));
		s.selectByVisibleText("iham");
		
		driver.findElement(By.id("btnCancel")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']"));*/
		
	}

}
