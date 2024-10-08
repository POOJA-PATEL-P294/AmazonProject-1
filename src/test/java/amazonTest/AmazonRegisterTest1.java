package amazonTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import amazonProject.NewUserRegister1;

public class AmazonRegisterTest1 
{

	@Test
	public void registration()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2F"
				+ "www.amazon.in%2Fevents%2Fgreatindianfestival%2F%26ref_%3Dnav_signin%3F_encoding%3DUTF8%26_"
				+ "encoding%3DUTF8%26pf_rd_i%3Dnavbar-4201%26pf_rd_m%3DA21TJRUUN4KGV%26pf_rd_p%3D66207b44-4945-"
				+ "45d9-80c5-65f68cc90a0c%26pf_rd_r%3D51Y7XB3DJFE84TWWD5Z1%26pf_rd_s%3Dnav-sitewide-msg%26pf_rd_"
				+ "t%3D4201%26ref_%3Dnav_signin%26claim_type%3DMobileNumber%26new_account%3D1%26discounts-"
				+ "widget%3D%252522%25257B%25255C%252522state%25255C%252522%25253A%25257B%25255C%252522refinement"
				+ "Filters%25255C%252522%25253A%25257B%25257D%25257D%25252C%25255C%252522version%25255C%252522%"
				+ "25253A1%25257D%252522&prevRID=EST9QM3K997HZ1ETNZVY&openid.identity=http%3A%2F%2Fspecs."
				+ "openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_"
				+ "setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid."
				+ "net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		NewUserRegister1 reg=new NewUserRegister1(driver);
		reg.name();
		reg.mobile();
		reg.password();
		reg.verify();
		
		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "Authentication required");
		
	}
}
