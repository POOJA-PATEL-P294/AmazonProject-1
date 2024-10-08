package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginFailsEmail3
{

	@FindBy(id="ap_email")
	WebElement userName;
	
	@FindBy(id="continue")
	WebElement cont;
	
	@FindBy(id="ap_password")
	WebElement password;

	@FindBy(id="signInSubmit")
	WebElement signB;
	
	public void login()
	{
		userName.sendKeys("9483325961");
		cont.click();
		password.sendKeys("Patel#135");
		signB.click();
	}
	
	public AmazonLoginFailsEmail3(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
