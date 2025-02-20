package Utility;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import ultimateQa.BaseClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

public class SeleniumUtilities extends BaseClass{

    public static void clickElement(By locator) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        element.click();
    }

    public static void clickElement(WebElement element) {
        explicitlyWaitForElement(element, Duration.ofSeconds(10));
        element.click();
    }

    public static void sendText(By locator, String text) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        element.clear();
        element.sendKeys(text);
    }

    public static void actionOnElement(By locator) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public static WebElement explicitlyWaitForElement(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void explicitlyWaitForElement(WebElement element, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void assertTextEquals(By locator, String expectedText) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        String actualText = element.getText();
        assertEquals(actualText, expectedText, "Text does not match!");
    }

    public static void softAssertTextEquals(By locator, String expectedText) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        SoftAssert softAssert = new SoftAssert();
        String actualText = element.getText();
        softAssert.assertEquals(actualText, expectedText, "Text does not match!");
        softAssert.assertAll();
    }

    public static String takeScreenshot(String screenshotName) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        System.out.println(timestamp);
        String filePath = "screenshots/" + screenshotName + "_" + timestamp + ".png";
        System.out.println(filePath);
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.createDirectories(Paths.get("screenshots"));
            Files.copy(srcFile.toPath(), Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to save screenshot: " + filePath, e);
        }
        return filePath;
    }

    public static void scrollToElement(By locator) {
        WebElement element = explicitlyWaitForElement(locator, Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollBy(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public static boolean isElementPresent(By locator) {
        try {
            explicitlyWaitForElement(locator, Duration.ofSeconds(5));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

	
}
