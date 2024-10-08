package amazonTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonUpRemoveQuantyCart10 
{
	WebDriver driver=new ChromeDriver();

	@FindBy(id="twotabsearchtextbox")
	WebElement searchProd;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'][1])")
	WebElement clkProd;
	
	/*@FindBy(xpath="//select[@class='a-button a-button-dropdown']")
	WebElement quant;*/
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	public void searchPro() 
	{
		searchProd.sendKeys("kurtas");
		/*Thread.sleep(1000);
		sof.sendKeys(Keys.ARROW_DOWN);
		/*Thread.sleep(1000);
		sof.sendKeys(Keys.ARROW_DOWN);*/
		searchProd.sendKeys(Keys.ENTER);
	}
	
	public void clkPro() throws InterruptedException
	{
		Thread.sleep(1000);
		clkProd.click();
	}

	public void proToCart() 
	{
		Set<String> sng=driver.getWindowHandles();
		Iterator<String> i=sng.iterator();
		
		String pw=(String) i.next();
		String cw=(String) i.next();
		
		System.out.println(pw);
		System.out.println(cw);
		
		addToCart.click();
		
	}

	/*public void prodQuanti() throws InterruptedException
	{
		quant.click();
		Thread.sleep(1000);
		quant.sendKeys(Keys.ARROW_DOWN);
		//quant.sendKeys(Keys.ARROW_DOWN);
		//quant.sendKeys(Keys.ARROW_DOWN);
		quant.click();
		
		
	}*/
	public AmazonUpRemoveQuantyCart10(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
//submit.add-to-cart