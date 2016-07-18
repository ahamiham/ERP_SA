package Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage
{
	@FindBy (id = "mi_a_stock_items")
	WebElement stockitems;
	
	@FindBy (id = "mi_a_suppliers")
	WebElement suppliers;
	
	@FindBy (id = "mi_a_purchases")
	WebElement purchases;
	
	@FindBy (id = "mi_a_customers")
	WebElement customers;
	
	@FindBy (id = "mi_a_sales")
	WebElement sales;
	
	@FindBy (id = "mci_Outstandings")
	WebElement outstandings;
	
	@FindBy (id = "mci_Settings")
	WebElement settings;
	
	@FindBy (id = "mi_logout")
	WebElement logout;
	
	@FindBy (xpath = ".//*[@class='ewHome']")
	WebElement home;
}
