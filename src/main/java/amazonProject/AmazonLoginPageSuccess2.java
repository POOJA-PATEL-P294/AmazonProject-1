package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPageSuccess2
{

	@FindBy(name="email")
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
		password.sendKeys("Patel#1357");
		signB.click();
	}
	
	public AmazonLoginPageSuccess2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
