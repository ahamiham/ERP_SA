package com.ERP.jars;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class two_sheets
{
	public static void main(String[] args) throws IOException 
	{
		String s1, s2, Eval, Aval;
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("D:\\2sheets.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("data1");
		
		int rc = ws.getLastRowNum();	
		System.out.println(rc);
		for (int i = 1; i <= rc; i++)
		{
			XSSFRow row = ws.getRow(i);
			XSSFCell c1 = row.getCell(0);
			XSSFCell c2 = row.getCell(1);
			XSSFCell c3 = row.createCell(2);
			
			s1 = c1.getStringCellValue();
			s2 = c2.getStringCellValue();
			
			System.out.println(s1+"      "+s2);
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.id("btnreset")).click();
			
			driver.findElement(By.id("username")).sendKeys(s1);
			driver.findElement(By.id("password")).sendKeys(s2);
			driver.findElement(By.id("btnsubmit")).click();
			
			try 
			{
				Eval = "Incorrect user ID or password";
				Aval = driver.findElement(By.xpath(".//*[@class='alert alert-danger ewError']")).getText();
				if (Eval.equalsIgnoreCase(Aval))
				{
					driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
					c3.setCellValue("Fail");
				}
				
					
			}
			
			catch (Exception e) 
			{
				
				Eval = "Logout";
				Aval = driver.findElement(By.id("mi_logout")).getText();
			
				if (Eval.equalsIgnoreCase(Aval)) 
				{
					driver.findElement(By.id("mi_logout")).click();
					c3.setCellValue("Pass");
				}
				
			}
			
			
			
			
		}
		/*This is to create another sheet rows and columns
		 for (int j = 0; j <= 4; j++)
		{
			//XSSFRow row1 = ws1.getRow(j);
			for (int i = 0; i <= 3; i++)
			{
				
				//System.out.println(row1.getCell(i));
			}
			
		}*/

		FileOutputStream fos = new FileOutputStream("D://2sheets.xlsx");
		wb.write(fos);
		wb.close();
	}

}
