import java.util.List;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayPracticeByY {
	public static ChromeDriver driver;
	//WebDriverManager.chromedriver().setup(); ????
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays();
	}
	
	public static String arrays() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> countries = driver.findElements(By.xpath("//table[@id='customers']/child::tbody/child::tr/child::td[3]"));
		String[] countrieslist = {"Germany", "Mexico"," Austria","UK","Canada","Italy"};
		for(int i=0; i<countries.size(); i++) 
		{
			if(countries.get(i).getText().equals(countrieslist[i])) {
				
			System.out.println(countries.get(i).getText());
			System.out.println("Test Data matches given data");
			
			}
			else
			{
				System.out.println("Test Data doesn't match given data");
			}
			
		}
		return "countries.get(i).getText()";
	}
	
}

