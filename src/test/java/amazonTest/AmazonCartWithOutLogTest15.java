package amazonTest;

import org.testng.annotations.Test;

import amazonProject.AmazonCartWithOutLog15;

public class AmazonCartWithOutLogTest15 extends LaunchTest
{
	@Test
	public void cartWithoutLogin() throws InterruptedException
	{
		AmazonCartWithOutLog15 acw=new AmazonCartWithOutLog15(driver);
		acw.search();
		acw.carttt();
		acw.goToCart();
	}

}
