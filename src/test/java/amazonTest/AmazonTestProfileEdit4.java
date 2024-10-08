package amazonTest;



import org.testng.annotations.Test;

import amazonProject.AmazonLoginPageSuccess2;
import amazonProject.AmazonProfileEdit4;
import amazonProject.LogAmazonHomePage2;

public class AmazonTestProfileEdit4 extends LaunchTest
{
	@Test
	public void profile() throws InterruptedException
	{
		LogAmazonHomePage2 hover=new LogAmazonHomePage2(driver);
		hover.AccountAndList(driver);
		hover.signIn();
		
		AmazonLoginPageSuccess2 pro=new AmazonLoginPageSuccess2(driver);
		pro.login();
		hover.AccountAndList(driver);
		
		AmazonProfileEdit4 ape=new AmazonProfileEdit4(driver);
		ape.manage();
		ape.viewManage();
		ape.proManage();
		ape.editManage();
		ape.contManage();	
	}

}
