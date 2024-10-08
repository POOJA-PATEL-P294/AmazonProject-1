package amazonTest;

import org.testng.annotations.Test;

import amazonProject.AmazonCartFromProductPage9;
import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestCartFromProductPage9 extends LaunchTest
{
	@Test
	public void show() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
	
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		AmazonCartFromProductPage9 acrfpp=new AmazonCartFromProductPage9(driver);
		acrfpp.prod();
		acrfpp.proCa();
		acrfpp.Carto();


	}
	
}
