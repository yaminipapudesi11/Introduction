import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction{

	public static void main(String[] args) {

		//Invoking the Browser
		//Chrome - ChromeDriver -> Methods
//		WebDriver driver = new WebDriver();
		System.setProperty("webdriver.chromedriver", "C:/Users/anilk/Documents/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		WebDriver driverf = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
//		//Firefox - FirefoxDriver -> Methods
//		FirefoxDriver driverf = new FirefoxDriver();
		
		
		
		
	}

}
