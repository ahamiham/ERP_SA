package com.ERP.masterscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterLogin 
{
	public static WebDriver driver;
	public static String Eval,Aval;

	    public void openApp(String URL)
	    {
	    Eval="Login";
	    driver=new FirefoxDriver();
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    Aval=driver.findElement(By.id("btnsubmit")).getText();
	    if (Eval.equalsIgnoreCase(Aval)) 
	    {
	    	System.out.println("Pass");
	    	//return "pass";	
		}
	    else
	    {
	    	System.out.println("Fail");
	    	//return "fail";
	    }
	    
	    }
	    public void AdminLgn(String Un,String Pwd)
	    {
	    	Eval="Administrator";
	    	driver.findElement(By.id("btnreset")).click();
	    	driver.findElement(By.id("username")).sendKeys(Un);
	    	driver.findElement(By.id("password")).sendKeys(Pwd);
	    	driver.findElement(By.id("btnsubmit" )).click();
	    	
	    	Aval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	    	
	    	if (Eval.equalsIgnoreCase(Aval)) 
	        {
	    		
	    		System.out.println("Login Pass");
	        	//return "pass";	
	    	}
	        else
	        {
	        	
	        	System.out.println("Login Fail");
	        	//return "fail";
	        }
	        
	    }
}