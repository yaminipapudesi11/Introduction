package ultimateQa;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openchromedriverByY {

	public static ChromeDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		mouseInteractions();
	
	}
	
	public static void mouseInteractions() throws InterruptedException {
	
		driver.get("https://www.amazon.com/");
		

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		// implicitwait wait will wait for all the elements for a given time before throwing the exception
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));		
		action.moveToElement(element).build().perform();
		action.contextClick(element).build().perform();
		action.doubleClick().build().perform();
		action.dragAndDrop(element, element).build().perform();
		action.scrollToElement(element).build().perform();	
	}
	
	public static void webpage1() throws InterruptedException {
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox1.click();
		Thread.sleep(1000);
		
		WebElement CheckBox2 = driver.findElement(By.xpath("//div[@id='checkbox-example']/child::fieldset/child::label[2]"));
		if(CheckBox2.getText().equals("Option2")){
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		}else {
			System.out.println("CheckBox Option2 Doesn't Exist");
		}
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

	public static void webpage2() throws InterruptedException
	{
		//opening  new web page
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		WebElement Title = driver.findElement(By.xpath("//section[@id='section']/descendant::h2"));
		Title.getText();
		if(Title.getText().equals("Register")) {
		
			WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			
				if(FirstName.isEnabled()) {
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Yamini");
				}
				else
				{
					System.out.println("FirstName Field is not enabled");
				}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Papudesi");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("My Address");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yaminipapudesi@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("704-562-8682");
			Thread.sleep(1000);
			WebElement RadioMale = driver.findElement(By.xpath("//input[@value='Male']"));
			RadioMale.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
			Thread.sleep(1000);
			if(RadioMale.isSelected()) {
				System.out.println("Male is Selected");
			}
			else
			{
				System.out.println("FeMale is Selected");
			}
			
			WebElement Hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']/parent::div/parent::div/parent::div/label"));
			Hobbies.getText();
			if(Hobbies.getText().equals("Hobbies")){
			driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
			Thread.sleep(2000);
			}
			else
			{
				System.out.println("Hobbies Doesn't Exist");
			}
		}
		else {
			System.out.println("No Title Exists");
			}
		driver.quit();
		}
		
		

	}

