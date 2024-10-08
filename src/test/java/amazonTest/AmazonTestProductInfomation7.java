package amazonTest;

import org.testng.annotations.Test;
import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.AmazonProductInfomation7;
import amazonProject.AmazonSearchProduct5;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestProductInfomation7 extends LaunchTest
{

	@Test
	public void details() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
		
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		AmazonSearchProduct5 asp=new AmazonSearchProduct5(driver);
		asp.searchpro();
		
		AmazonProductInfomation7 api=new AmazonProductInfomation7(driver);
		api.pro();
		
	}
}
