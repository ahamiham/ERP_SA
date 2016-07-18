package com.ERP.jars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//String s;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/h1/a/i/u")).click();
		//System.out.println(s);
	}

}
