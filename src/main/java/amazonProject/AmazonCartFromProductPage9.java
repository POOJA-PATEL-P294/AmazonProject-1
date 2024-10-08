package amazonProject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartFromProductPage9
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement sof;
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-square-aspect']")
	WebElement pro;
	
	@FindBy(xpath="//a[@class='a-button-text']")
	WebElement cirt;
	
	public void prod() throws InterruptedException
	{
		sof.sendKeys("towel");
		/*Thread.sleep(1000);
		sof.sendKeys(Keys.ARROW_DOWN);
		/*Thread.sleep(1000);
		sof.sendKeys(Keys.ARROW_DOWN);*/
		sof.sendKeys(Keys.ENTER);
		
	}
	public void proCa() throws InterruptedException
	{
		Thread.sleep(1000);
		pro.click();
	}
	public void Carto() 
	{
		
		cirt.click();
		
	}
	
	

	public AmazonCartFromProductPage9(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
