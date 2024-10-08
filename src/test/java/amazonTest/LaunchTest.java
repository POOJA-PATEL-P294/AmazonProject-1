package amazonTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchTest 
{
	WebDriver driver;
	//Actions act=new Actions(driver);

	@BeforeMethod
	public void Login()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
	}

}
