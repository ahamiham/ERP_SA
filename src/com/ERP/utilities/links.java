package com.ERP.utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com/");
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("mi_a_suppliers")).click();
		
		/*List<WebElement> we = driver.findElements(By.tagName("a"));
		for (int i = 0; i < we.size(); i++) 
		{
			String r = we.get(i).getText();
			System.out.println(r);
		}*/
		
		int Scount = 0;
		int Dcount=0;
		
		List<WebElement> cb = driver.findElements(By.name("key_m[]"));
		System.out.println(cb.size());
		
		for (int i = 0; i <cb.size(); i++) 
		{
			if (cb.get(i).isSelected()) 
			{
				Scount = i++;
				
			} else 
			{
				Dcount++;
			}		
		}
		System.out.println("Selected check Boxes  :"+Scount+"      "+" Deselected check boxes  :"+Dcount);
		}

}
