package amazonTest;



import org.testng.annotations.Test;
import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.LogAmazonHomePage2;

;

public class LogAmazonTest2 extends LaunchTest
{
	@Test
	public void loginToAmazon() throws InterruptedException
	{
		LogAmazonHomePage2 home=new LogAmazonHomePage2(driver);
		home.AccountAndList(driver);
		home.signIn();
		
		AmazonLoginPageSuccess2 page=new AmazonLoginPageSuccess2(driver);
		page.login();
		
		
		
		
	}


}
