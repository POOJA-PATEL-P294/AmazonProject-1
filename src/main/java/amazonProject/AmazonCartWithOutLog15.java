package amazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartWithOutLog15 
{
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBut;
	@FindBy(id="a-autoid-3-announce")
	WebElement cartt;
	@FindBy(linkText="Go to Cart")
	WebElement goToCart;
	public void search() throws InterruptedException
	{
		searchBut.sendKeys("Toys");
		Thread.sleep(1000);
		searchBut.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
	    searchBut.sendKeys(Keys.DOWN);
	    searchBut.sendKeys(Keys.ENTER);
	}
	public void carttt() throws InterruptedException
	{
		Thread.sleep(1000);
		cartt.click();
	}
	
	public void goToCart() throws InterruptedException
	{
		Thread.sleep(1000);
		goToCart.click();
	}
	public AmazonCartWithOutLog15(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	

}
