import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassPracticeByY {
public static ChromeDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//yaminisactions();
		webpage1();
	}
	

	//public static void yaminisactions() throws Exception {
		//Actions yaminiacts = new Actions(driver);
		
		//driver.get("https://demo.automationtesting.in/Register.html");
	    //driver.navigate().to("https://demo.automationtesting.in/Register.html");
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//List<WebElement> uiElements = driver.findElements(By.xpath("//li[@class='ng-scope']/a"));
			//driver.findElement(By.xpath("//div[@id='msdd']")).click();
			//String[] languages = {"Dutch","English","Czech"};
		
				
			//}
			
public static void webpage1() throws InterruptedException {
		
		//Navigating to the Webpage
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");	
		
		//Selecting all 3 checkboxes 
		//First checkbox is selected using simple xpath and explicit wait 
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(checkbox1));
		checkbox1.click();
		
		//Second checkbox is selected using descendant xpath and clicking after text is matching the given text
		WebElement CheckBox2 = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]"));
		if(CheckBox2.getText().equals("Option2")){
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		}else {
			System.out.println("CheckBox Option2 Doesn't Exist");
		}
		
		//Third checkbox is selected using a direct xpath and clicking on it
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		//Radio Button 1 is selected using xpath and clicking on it
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		//Verifying that the section header text is matching given text and then entering the country name by using a simple xpath
		WebElement SuggestionClassExample = driver.findElement(By.xpath("//div[@id='select-class-example']/descendant::legend"));
		SuggestionClassExample.getText();
		if(SuggestionClassExample.getText().equals("Suggession Class Example")){
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United States");
		}else {
			System.out.println("Text Doesn't Exist");
		}
		
		WebElement entertext = driver.findElement(By.xpath("//input[@id='name']"));
		//WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(entertext));		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Yamini");
		
		//selecting from a static drop down using select class
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select drpdwn1 = new Select(dropdown);
		drpdwn1.selectByValue("option1");
		Thread.sleep(2000);
		drpdwn1.selectByIndex(2);
		
		
		//Click on Alert and Accept
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept(); 
		
		
		//Click on Confirm and Cancel
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		
		
		//using actions class and java constructor move to an element at the bottom of the page 
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 	// Scroll to the bottom of the page
         js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
         
		WebElement mousehover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions yaminiacts = new Actions(driver);
		//yaminiacts.scrollToElement(mousehover).build().perform();
		yaminiacts.moveToElement(mousehover).build().perform();
		

		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		System.out.println("Success");
	}					
		 
 }
 
