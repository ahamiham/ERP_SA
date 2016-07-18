package com.ERP.masterscripts;

public class methods_calling
{
	public static void main(String[] args) 
	{
		StockAcc_Lib  s=new StockAcc_Lib();
		String res=s.OpenUrl("http://webapp.qedgetech.com");
		System.out.println(res);
	}
}
