package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base 
{

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() 
	  {
		 driver.findElement(By.id("btnreset")).click();
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.id("password")).sendKeys("master");
		 driver.findElement(By.id("btnsubmit")).click();
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.findElement(By.id("logout")).click();
		  org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		  
		  org.openqa.selenium.server.browserlaunchers.Sleeper.sleepTightInSeconds(2);
		  
		  List<WebElement> okb=driver.findElements(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
		    for (int i = 0; i < okb.size(); i++) 
		    {
		    	/*okb.get(i).click();
		    	break;*/
		    	
		    	//use above code or below
		    	
		    	if (okb.get(i).getText().equalsIgnoreCase("OK!"))
		    	{
		    		okb.get(i).click();
		    		break;
		  		}
		    			  		
		  	}
	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {  
		  driver = new FirefoxDriver();
		  driver.get("http://webapp.qedgetech.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		 //driver.close();
	  }

}