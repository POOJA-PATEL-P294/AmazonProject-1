package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogAmazonHomePage2
{
WebDriver driver;

	
	//Step-1
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountList;
	
	@FindBy(linkText="Sign in")
	WebElement signinButt;
	//step-2
	public void AccountAndList(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(accountList).perform();
		
	}
	
	public void signIn() throws InterruptedException
	{
	
		signinButt.click();
	}
	//step-3
	public LogAmazonHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
