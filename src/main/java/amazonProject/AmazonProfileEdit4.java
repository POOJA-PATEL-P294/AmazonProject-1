package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProfileEdit4
{
	@FindBy(xpath="//div[@class='sc-ktJbId havkrC']")
	WebElement managePro;
	
	@FindBy(linkText="View")
	WebElement view;
	
	@FindBy(xpath="//span[@class='a-declarative']")
	WebElement editPro;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement proName;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement conti;
	
	public void manage()
	{
		managePro.click();
	}
	
	public void viewManage()
	{
		view.click();
	}
	public void editManage()
	{
		
		editPro.click();
	}
	public void proManage()
	{
		proName.sendKeys("Pooo");
	}
	public void contManage()
	{
		conti.click();
	}
	public AmazonProfileEdit4(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
