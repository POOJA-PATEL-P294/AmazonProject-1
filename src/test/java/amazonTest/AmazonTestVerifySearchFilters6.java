package amazonTest;

import org.testng.annotations.Test;

import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.AmazonSearchProduct5;
import amazonProject.AmazonVerifySearchFilters6;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestVerifySearchFilters6 extends LaunchTest
{
	@Test
	public void searchFil() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
		
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		AmazonSearchProduct5 asp=new AmazonSearchProduct5(driver);
		asp.searchpro();
		
		AmazonVerifySearchFilters6 avsf=new AmazonVerifySearchFilters6(driver);
		avsf.menR();
		avsf.ass();
		avsf.sho();
		
	}

}
