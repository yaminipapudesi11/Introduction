package ultimateQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePage {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(dependsOnMethods =  "m3")
	
	public void m4() throws InterruptedException {
			
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void m3() throws InterruptedException {
		Thread.sleep(1000);
		
		WebElement CheckBox2 = driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label[2]"));
		
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label[2]"));

		//Hard assert
		Assert.assertEquals(CheckBox2.getText(), "Option2", "Test data not matched");
		
		Assert.assertTrue(checkbox1.isDisplayed());
		Assert.assertTrue(checkbox1.isDisplayed(),"Chwckbox is not displayed");
		Assert.fail();
		
		//Soft assert
		SoftAssert softassert  = new SoftAssert();
		
		softassert.assertEquals(false, false);
		
		
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1000);
		
		WebElement SuggestionClassExample = driver.findElement(By.xpath("//div[@id='select-class-example']/descendant::legend"));
		SuggestionClassExample.getText();
		if(SuggestionClassExample.getText().equals("Suggession Class Example")){
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
		}else {
			System.out.println("Text Doesn't Exist");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Yamini");
		Thread.sleep(2000);
		driver.quit();

	}

}
