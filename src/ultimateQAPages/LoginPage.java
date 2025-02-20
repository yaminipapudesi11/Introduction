package ultimateQAPages;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import Utility.SeleniumUtilities;
import ultimateQa.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STFtnEdn;


public class LoginPage {
	WebDriver driver;	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	By login = By.xpath("//a[text()='Log in']");
	By email = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By loginbtn = By.xpath("//input[@value='Log in']");
	By errorMsg = By.xpath("//div[@class='message-error']//span");
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login2;
	
	public void clickOnLoginUrl() {
		SeleniumUtilities.clickElement(login);
		//.clickElement(login);
	}
	
	public void enterUsername(String username) {
		SeleniumUtilities.sendText(email, username);
	}
	public void enterPassword(String pwd) {
		SeleniumUtilities.sendText(password, pwd);
	}
	public void clickOnLoginBtn() {
		SeleniumUtilities.clickElement(loginbtn);
		verifyTheErrorMsg();
	}
	
	public void verifyTheErrorMsg() {
		SeleniumUtilities.assertTextEquals(errorMsg, "Login was unsuccessful. Please correct the errors and try again.");
	}
  
}



