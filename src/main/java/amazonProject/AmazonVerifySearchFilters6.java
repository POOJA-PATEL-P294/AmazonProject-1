package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonVerifySearchFilters6 
{
	@FindBy(linkText="Men's Running Shoes")
	WebElement menRun;
	
	@FindBy(linkText="ASIAN")
	WebElement as;
	
	@FindBy(id="a-autoid-6")
	WebElement shoeSize;
	
	public void menR()
	{
		menRun.click();	
	}
	public void ass() throws InterruptedException
	{
		as.click();;
		Thread.sleep(6000);
	}
	public void sho()
	{
		shoeSize.click();
	}
	
	public AmazonVerifySearchFilters6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
