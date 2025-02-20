                  import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsAndWindowsByY {
public static ChromeDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
handlewindows();
	}
	public static void handlewindows() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//how to switch to a frame
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//a[text()='Practice'])[1]")).click();
		driver.switchTo().defaultContent();
		//WebElement radio1 = driver.findElement(By.xpath(null));
		//radio1.getAttribute("value");
		//String value = radio1.getAttribute("value");
		//driver.findElement(By.id("openwindow")).click();
		//radio1.getCssValue("innertext");
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> i = handles.iterator();
		
		
		  while(i.hasNext()) { 
			  String win = i.next();
			  if(driver.switchTo().window(win).getTitle().equals("QAClick Academy - A Testing Academy to Learn, Earn and Shine")) {
				 driver.switchTo().window(win); 
				 break;
			  }
		  
		  }
		  driver.findElement(By.xpath("//a[text()='Courses']")).click();
		 
		System.out.println("Success");
	}
}
