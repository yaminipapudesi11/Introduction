package ultimateQAPages;

import org.testng.annotations.Test;

import Utility.SeleniumUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this); 
	}
	
	By register = By.xpath("//a[text()='Register']");
	By genderRadioBtn = By.id("gender-female");
	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By email = By.id("Email");
	By pwd =By.id("Password");
	By cnfPwd = By.id("ConfirmPassword");
	By registerBtn = By.name("register-button");
	By continueBtn = By.xpath("//input[@value='Continue']");
	By registrationResult = By.xpath("//div[@class='result']");
	
	public void clickOnRegisterURL() {
		SeleniumUtilities.clickElement(register);
	}
	public void selectGender() {
		SeleniumUtilities.clickElement(genderRadioBtn);
	}
	public void enterFirstName(String fName) {
		SeleniumUtilities.sendText(firstName, fName);
	}
	public void enterLastName(String lName) {
		SeleniumUtilities.sendText(lastName, lName);
	}
	public void enterEmail(String eml) {
		SeleniumUtilities.sendText(email, eml);
	}
	public void enterPassword(String password) {
		SeleniumUtilities.sendText(pwd, password);
	}
	public void confirmPassword(String confirmpassword) {
		SeleniumUtilities.sendText(cnfPwd, confirmpassword);
	}
	public void clickOnRegisterBtn() {
		SeleniumUtilities.clickElement(registerBtn);
	}
	public void clickOnContinueButton() {
		SeleniumUtilities.softAssertTextEquals(registrationResult,"Yo4ur registration completed");
		SeleniumUtilities.clickElement(continueBtn);
	}
	
}
