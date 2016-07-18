package com.ERP.masterscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Methods_Mahi 
{
	public static WebDriver driver = new FirefoxDriver();
	public static String Eval, Aval, Msgact, Msgexp;
	 
	public String openurl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Eval = "Login";
		Aval = driver.findElement(By.id("btnsubmit")).getText();
		if (Eval.equalsIgnoreCase(Aval))
		{
			return "pass";
		} else 
		{
			return "fail";
		}
	}
	
	public String adminlogin(String uname, String pwd)
	{
		
		String ret="null";
		driver.findElement(By.id("btnreset")).click();
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(uname);
		//driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Sleeper.sleepTightInSeconds(3);
		
		Eval = "logout";
		Msgexp = "Incorrect user ID or password";
		
		try 
		{
			Msgact = driver.findElement(By.xpath(".//*[@class='alert alert-danger ewError']")).getText();
			if (Msgexp.equalsIgnoreCase(Msgact)) 
			{
				driver.findElement(By.xpath(".//button[@class='ajs-button btn btn-primary']")).click();
				Sleeper.sleepTightInSeconds(3);
			}
		} 
		catch (Exception e) 
		{
			Aval = driver.findElement(By.id("logout")).getText();
			
			if (Eval.equalsIgnoreCase(Aval))
			{
				ret= "pass";
			} else 
			{
				ret= "fail";
			}
			driver.findElement(By.id("logout")).click();
			driver.findElement(By.xpath(".//button[@class='ajs-button btn btn-primary']")).click();
		}
		
			
		
		return ret;
					
	}
	
	public String suppliers_creation(String Sname, String Adress, String city, String country, 
								String person, String mobile, String email, String cell, String notes)
								
	{
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath(".//a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		driver.findElement(By.id("x_Supplier_Name")).sendKeys(Sname);
		driver.findElement(By.id("x_Address")).sendKeys(Adress);
		driver.findElement(By.id("x_City")).sendKeys(city);
		driver.findElement(By.id("x_Country")).sendKeys(country);
		driver.findElement(By.id("x_Contact_Person")).sendKeys(person);
		driver.findElement(By.id("x_Phone_Number")).sendKeys(mobile);
		driver.findElement(By.id("x__Email")).sendKeys(email);
		driver.findElement(By.id("x_Mobile_Number")).sendKeys(cell);
		driver.findElement(By.id("x_Notes")).sendKeys(notes);
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		Eval = "logout";
		Aval = driver.findElement(By.id("logout")).getText();
		if (Eval.equalsIgnoreCase(Aval))
		{
			return "pass";
		} else 
		{
			return "fail";
		}
	}

	public void stock_category(String cname)
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		
		driver.findElement(By.id("mi_a_stock_categories")).click();
		driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("x_Category_Name")).sendKeys(cname);
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	}

	public String uom(String uid, String udes)
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		
		driver.findElement(By.id("mi_a_unit_of_measurement")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		
		driver.findElement(By.id("x_UOM_ID")).sendKeys(uid);
		driver.findElement(By.id("x_UOM_Description")).sendKeys(udes);
		driver.findElement(By.id("btnAction")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		
		Eval = "Add succeeded";
		Aval = driver.findElement(By.xpath(".//*[@class='alert alert-success ewSuccess']")).getText();
		
		if (Eval.equalsIgnoreCase(Aval))
		{
			return "pass";
		} else 
		{
			return "fail";
		}		
	}

	public void stock_creation()
	{
		driver.findElement(By.linkText("Stock Items")).click();
		//driver.findElement(arg0)
	}
}
