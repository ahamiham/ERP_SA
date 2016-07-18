package Page_object_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class POM_call
{
	public void url()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Urlpage uhp = PageFactory.initElements(driver, Urlpage.class);
	uhp.reset.click();
	uhp.username.sendKeys("admin");
	uhp.password.sendKeys("master");
	uhp.login.click();
	
	homepage hp = PageFactory.initElements(driver, homepage.class);
	/*
	hp.stockitems.click();
	hp.home.click();
	hp.suppliers.click();
	hp.purchases.click();
	hp.outstandings.click();
	hp.settings.click();
	hp.sales.click();
	hp.customers.click();
	hp.logout.click();*/
	
	uom_creation uom = PageFactory.initElements(driver, uom_creation.class);
	Actions act = new Actions(driver);
	act.moveToElement(hp.stockitems).build().perform();
	
	uom.Uom_creation("htufhb", "fhrgyjn");
	
	}

}
