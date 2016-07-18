package Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class uom_creation 
{
	@FindBy (id = "mi_a_stock_items")
	WebElement stockitems;
	
	@FindBy (id = "mi_a_unit_of_measurement")
	WebElement uom;
	
	@FindBy (xpath = ".//*[@class='btn btn-default ewAddEdit ewAdd btn-sm']")
	WebElement plus;
	
	@FindBy (id = "x_UOM_ID")
	WebElement uid;
	
	@FindBy (id = "x_UOM_Description")
	WebElement udes;
	
	@FindBy (id = "btnAction")
	WebElement addbtn;
	
	@FindBy (xpath = ".//*[@class = 'ajs-button btn btn-primary']")
	WebElement ok;
	
	
	public void Uom_creation(String uddid,String udesc)
	{
		
		uom.click();
		plus.click();
		uid.sendKeys(uddid);
		udes.sendKeys(udesc);
		addbtn.click();
		ok.click();
		Sleeper.sleepTightInSeconds(3);
		ok.click();
		
		
		
		
		
		
		
	}
}
