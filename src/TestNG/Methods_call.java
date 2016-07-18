package TestNG;
//helloooooooo
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Methods_call extends Base
{
	String Eval, Aval;
	@Test
	public void SupC()
	
	{
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath(".//a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("dehfb");
		driver.findElement(By.id("x_Address")).sendKeys("drg");
		driver.findElement(By.id("x_City")).sendKeys("sedht");
		driver.findElement(By.id("x_Country")).sendKeys("ehr6sa");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("eh6t75ast");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("erthd6tsh");
		driver.findElement(By.id("x__Email")).sendKeys("rg5e67e6rg");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("ear6urgd");
		driver.findElement(By.id("x_Notes")).sendKeys("darthg");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		
		Eval = "Add succeeded";
		Aval = driver.findElement(By.xpath(".//*[@class='alert alert-success ewSuccess']")).getText();
		
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		
		if (Eval.equalsIgnoreCase(Aval))
		{
			System.out.println("Supplier Created");
		} 
		else 
		{
			System.out.println("Supplier Creation Failed");
		}
	}
}
