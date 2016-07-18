package com.ERP.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties_login_methods 
{
	public static Properties pr;
	public static FileInputStream fis;
	public static WebDriver driver = new FirefoxDriver();
	public static String Eval, Aval;
	
	public String openurl(String url) throws IOException
	{
		pr =new Properties();
		fis =new FileInputStream("D:\\Iham\\ERP_SA_Iham\\src\\com\\ERP\\properties\\idxpath_properties.properties");
		pr.load(fis);
		Eval = "login";
		
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Aval = driver.findElement(By.id(pr.getProperty("login_button_id"))).getText();
		
		if (Eval.equalsIgnoreCase(Aval))
		{
			return "Page opened";
			
		} 
		else 
		{
			return "Page Not opened";
		}
	}

	public void adminlogin(String uname, String pwd)
	{
		driver.findElement(By.id(pr.getProperty("reset_id"))).click();
		driver.findElement(By.id(pr.getProperty("username_id"))).sendKeys(uname);
		driver.findElement(By.id(pr.getProperty("password_id"))).sendKeys(pwd);
		driver.findElement(By.id(pr.getProperty("login_button_id"))).click();
	}

	public void suppl_creation(String sname, String sadres,String scity,String scountry,String sperson,String sphone,String smail,String scell,String snotes)
	{
		driver.findElement(By.linkText(pr.getProperty("supplier_link"))).click();
		driver.findElement(By.xpath(pr.getProperty("suplier_creation_xpath"))).click();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id(pr.getProperty("supl_name"))).sendKeys(sname);
		driver.findElement(By.id(pr.getProperty("supl_adres"))).sendKeys(sadres);
		driver.findElement(By.id(pr.getProperty("supl_city"))).sendKeys(scity);
		driver.findElement(By.id(pr.getProperty("supl_country"))).sendKeys(scountry);
		driver.findElement(By.id(pr.getProperty("supl_person"))).sendKeys(sperson);
		driver.findElement(By.id(pr.getProperty("supl_phone"))).sendKeys(sphone);
		driver.findElement(By.id(pr.getProperty("supl_mail"))).sendKeys(smail);
		driver.findElement(By.id(pr.getProperty("supl_cell"))).sendKeys(scell);
		driver.findElement(By.id(pr.getProperty("supl_notes"))).sendKeys(snotes);
		driver.findElement(By.id(pr.getProperty("supl_add_id"))).click();
		driver.findElement(By.xpath(pr.getProperty("supl_alerts"))).click();
		driver.findElement(By.xpath(pr.getProperty("supl_alerts"))).click();
		driver.findElement(By.xpath(pr.getProperty("supl_alerts"))).click();
	}
}
