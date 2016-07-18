package Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Urlpage
{
	@FindBy (id = "btnreset")
	WebElement reset;
	
	@FindBy (id = "username")
	WebElement username;
	
	@FindBy (id = "password")
	WebElement password;
	
	@FindBy(id = "btnsubmit")
	WebElement login;

}
