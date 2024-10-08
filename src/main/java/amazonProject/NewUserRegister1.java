package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRegister1
{
	WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(name="email")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verify;

	
	public void name()
	{
		name.sendKeys("POOJA PATEL P");
		
	}
	public void mobile()
	{
		mobile.sendKeys("9483325961");
		
	}
	public void password()
	{
		password.sendKeys("Patel#1357");
	}
	public void verify()
	{
		verify.click();
	}
	public NewUserRegister1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
