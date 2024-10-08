package amazonTest;

import org.testng.annotations.Test;

import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestUpRemoveQuantyCart10 extends LaunchTest
{
	@Test
	public void show() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
	
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		AmazonUpRemoveQuantyCart10 aurqc=new AmazonUpRemoveQuantyCart10(driver);
		aurqc.searchPro();
		aurqc.clkPro();
		aurqc.proToCart();
		//aurqc.prodQuanti();
		
	}

}
