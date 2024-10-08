package amazonTest;

import org.testng.annotations.Test;
import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.AmazonSearchProduct5;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestSearchProduct5 extends LaunchTest
{
	@Test
	public void searchProduct() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
		
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		AmazonSearchProduct5 asp=new AmazonSearchProduct5(driver);
		asp.searchpro();
	}

	
	
}
