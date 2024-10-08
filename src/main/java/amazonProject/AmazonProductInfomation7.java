package amazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductInfomation7 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='s-image-padding']")
	WebElement proinfo;
	
	public void pro()
	{
		proinfo.click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.titleIs("amazon"));
	}
	public AmazonProductInfomation7(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
