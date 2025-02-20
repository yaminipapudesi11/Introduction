package ultimateQAPages;

import org.testng.annotations.Test;

import Utility.SeleniumUtilities;


import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
public class AddToCartPage {
	
	WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}
	 By login = By.xpath("//a[text()='Log in']");
	 By email = By.xpath("//input[@id='Email']");
	 By password = By.xpath("//input[@id='Password']");
	 By loginbtn = By.xpath("//input[@value='Log in']");
	 By books = By.xpath("//div[@class='listbox']//a[@href='/books']");
	 By selectFirstBook = By.xpath("//div[@data-productid='13']//input[@value='Add to cart']");
	 By selectSecondBook = By.xpath("//div[@data-productid='22']//input[@value='Add to cart']");
	 By shoppingCart = By.xpath("//ul/li[@id='topcartlink']/a");
	 By logOut = By.xpath("//a[@href='/logout']");
	  
	 public void clickOnLoginUrl() {
		 SeleniumUtilities.clickElement(login);
		}
	 public void enterUsername(String username) {
		 SeleniumUtilities.sendText(email, username);
		}
	 public void enterPassword(String pwd) {
		 SeleniumUtilities.sendText(password, pwd);
		}
	 public void clickOnLoginBtn() {
			SeleniumUtilities.clickElement(loginbtn);
		}
	 public void clickOnBooksLink() {
		  SeleniumUtilities.clickElement(books);
	  }
	 public void addFirstBookToTheCart() {
		  SeleniumUtilities.clickElement(selectFirstBook);
	  }
	  
	 public void addSecondBookToTheCart() {
		  SeleniumUtilities.actionOnElement(selectSecondBook);
	  }
	  
	  public void clickOnShoppingCart() {
		  SeleniumUtilities.actionOnElement(shoppingCart);
	  }
	  public void logOut() {
		  SeleniumUtilities.clickElement(logOut);
	  }

}