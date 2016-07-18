package com.ERP.properties;

import java.io.IOException;

public class Properties_mathod_calling 
{

	public static void main(String[] args) throws IOException
	
	{
		Properties_login_methods o =new Properties_login_methods();
		String res = o.openurl("url");
		System.out.println(res);
		
		Properties_login_methods a = new Properties_login_methods();
		a.adminlogin("admin", "master");
		
		Properties_login_methods sc = new Properties_login_methods();
		sc.suppl_creation("Mahe", "central", "kochi", "India", "mahe", "9010010090", "shiva@gmail", "9000100000", "None");
	}

}
