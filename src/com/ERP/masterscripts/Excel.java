package com.ERP.masterscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static void main(String[] args) throws IOException
	{
		Methods_Mahi o = new Methods_Mahi();
		String res = o.openurl("http://webapp.qedgetech.com");
		System.out.println(res);
		 
		FileInputStream fis = new FileInputStream("D:\\001Iham\\Excel_test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Mytest");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
				
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow row = ws.getRow(i);
			XSSFCell c1 = row.getCell(0);
			XSSFCell c2 = row.getCell(1);
			XSSFCell c3 = row.createCell(2);
			
			String uname = c1.getStringCellValue();
			String pwd = c2.getStringCellValue();
			
			 res=o.adminlogin(uname, pwd);
			System.out.println(res);
			
			c3.setCellValue(res);
		}
		FileOutputStream fos = new FileOutputStream("D:\\001Iham\\Excel_test.xlsx");
		wb.write(fos);
		wb.close();
	}
}
