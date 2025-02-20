package ultimateQaTestClass;

import org.testng.annotations.Test;


import ultimateQAPages.RegisterPage;
import ultimateQa.BaseClass;

public class RegisterTest extends BaseClass{

	@Test
	public void registerNewUser() {
		RegisterPage newUser = new RegisterPage(driver);
		newUser.clickOnRegisterURL();
		newUser.selectGender();
		newUser.enterFirstName("Yamini");
		newUser.enterLastName("Papudesi");
		newUser.enterEmail("yaminianilPap@gmail.com");
		newUser.enterPassword("123$Yami");
		newUser.confirmPassword("123$Yami");
		newUser.clickOnRegisterBtn();
		newUser.clickOnContinueButton();
	}

}
