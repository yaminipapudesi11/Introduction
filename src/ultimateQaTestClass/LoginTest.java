package ultimateQaTestClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Utility.SeleniumUtilities;
import ultimateQAPages.LoginPage;
import ultimateQa.BaseClass;

public class LoginTest extends BaseClass{
	
	
	
@Test
public void validateuserlogin() {
	LoginPage loginpage = new LoginPage(driver);
	loginpage.clickOnLoginUrl();
	loginpage.enterUsername("yaminianilPb@gmail.com");
	loginpage.enterPassword("123$Yami");
	loginpage.clickOnLoginBtn();
//	SeleniumUtilities.takeScreenshot("LoginAttempt");
	 String screenshotPath = SeleniumUtilities.takeScreenshot("LoginAttempt");
     System.out.println("Screenshot saved at: " + screenshotPath);
	
}




}
