package com.ERP.masterscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_test 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\001Iham\\Excel_test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.createSheet("Mytest");
				
		for (int i = 0; i < 3; i++) 
		{
			XSSFRow row = ws.createRow(i);
			for (int j = 0; j <= 2; j++) 
			{
				/*String str;
				System.out.println("Enter cell value");
				Scanner s = new Scanner(System.in);
				str = s.nextLine();*/
				row.createCell(j).setCellValue("Data");
			}
		}

		FileOutputStream fos = new FileOutputStream("D:\\001Iham\\Excel_test.xlsx");
		wb.write(fos);
		wb.close();
	
	}
}