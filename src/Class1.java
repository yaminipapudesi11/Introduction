------------------------------import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		Class2 A = new Class2();
		Class3 B = new Class3();
		System.out.println("The results from Class 1 are:");
		add();
		subtract();
		multiply();
		System.out.println("The results from Class 2 are:");
		A.addinclass2();
		A.subtractinclass2();
		A.multiplyinclass2();
		System.out.println("The results from Class 3 are:");
		B.addinclass3();
		B.subtractinclass3();
		B.multiplyinclass3();
		Class4 fruit = new Class4();
		fruit.add();
		fruit.Apple();
	}
	
public Class1() {
	System.out.println("This is a Constructor");
}
		public static int add()
		{
			int i = 0;
			int j = 1; 
			int sum = i + j;
			return sum;
			//System.out.println("The Sum is:" + sum);
		}
		public static void subtract()
		{
			int k = 1;
			int l = 2; 
			int sub = l-k;
			System.out.println("The Difference is:" + sub);
		}
		
		public static void multiply()
		{
			int m = 10;
			int n = 1;
			int mul = m*n;
			System.out.println("The Multiplication is:" + mul);
		}
	
}