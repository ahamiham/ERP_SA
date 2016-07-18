package com.ERP.masterscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NG_UOM 
{
	public WebDriver driver;
	
	  @Test
	  public void uom() 
	  {
		 Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
		 
		 driver.findElement(By.id("mi_a_unit_of_measurement")).click();
		 driver.findElement(By.xpath(".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		 driver.findElement(By.id("x_UOM_ID")).sendKeys("100kg");
		 driver.findElement(By.id("x_UOM_Description")).sendKeys("1kton");
		 driver.findElement(By.id("btnAction")).click();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		 driver.findElement(By.id("btnreset")).click();
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.id("password")).sendKeys("master");
		 driver.findElement(By.id("btnsubmit")).click();
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.findElement(By.id("logout")).click();
	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {  
		  driver = new FirefoxDriver();
		  driver.get("http://webapp.qedgetech.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		 driver.close();
	  }
}
