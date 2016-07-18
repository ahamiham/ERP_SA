package com.ERP.masterscripts;

public class Mahi_Method_call
{
	public static void main(String[] args) 
	{
		Methods_Mahi open = new Methods_Mahi();
		String o = open.openurl("http://webapp.qedgetech.com");
		System.out.println(o);
		
		Methods_Mahi admnlgn = new Methods_Mahi();
		String a = admnlgn.adminlogin("admin", "master");
		System.out.println(a);
		
		/*Methods_Mahi S_creation = new Methods_Mahi();
		String spc = S_creation.suppliers_creation("Mahe", "chennai", "kanchi", "India", "mahe", "9010010090", "shiva@gmail", "9000100000", "None");
		System.out.println(spc);
		
		Methods_Mahi sc = new Methods_Mahi();
		sc.stock_category("activas");
		
		Methods_Mahi uom = new Methods_Mahi();
		String re = uom.uom("act", "fiber");
		System.out.println(re);*/
	}
}
