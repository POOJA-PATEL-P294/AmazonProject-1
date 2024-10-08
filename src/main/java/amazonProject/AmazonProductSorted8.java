package amazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductSorted8 
{
	@FindBy(id="a-autoid-0")
	WebElement icon;	
	
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement rating;
	
	@FindBy(linkText="10% Off or more")
	WebElement percentage;

	public void iconn() throws InterruptedException  
	{
		icon.click();
		Thread.sleep(1000);
		icon.sendKeys(Keys.ARROW_DOWN);
		icon.sendKeys(Keys.ENTER);
		Thread.sleep(1000);	
	}
	public void rate()
	{
		rating.click();
	}
	public void perc()
	{
		percentage.click();
	}
	
	public AmazonProductSorted8(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
