package amazonTest;

import org.testng.annotations.Test;

import amazonProject.AmazonLoginFailsEmail3;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestLoginFailsEmail3 extends LaunchTest
{
	@Test
	public void loginToAmazon() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
	
		AmazonLoginFailsEmail3 fail=new AmazonLoginFailsEmail3(driver);
		fail.login();
	}
}
