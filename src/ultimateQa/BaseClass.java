package ultimateQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.ConfigReader;

public class BaseClass {
    public static WebDriver driver;

    @BeforeMethod
    public static void initializeBrowser() {
        // Fetch browser name from config.properties
        String browserName = ConfigReader.getKey("browsername");

        // Initialize the browser based on the value
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }

        // Navigate to the application URL
        driver.get(ConfigReader.getKey("URL"));
    }

    @AfterMethod
    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
