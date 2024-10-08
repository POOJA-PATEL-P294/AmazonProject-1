package amazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonSearchProduct5 
{

	@FindBy(id="twotabsearchtextbox")
	WebElement s;
	
	public void searchpro()
	{
		s.sendKeys("shoe");
		s.sendKeys(Keys.ENTER);
	}
	public  AmazonSearchProduct5(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
