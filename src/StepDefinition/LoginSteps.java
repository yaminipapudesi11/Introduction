package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import ultimateQAPages.LoginPage;
import ultimateQa.BaseClass;
import io.cucumber.java.en.Then;


public class LoginSteps extends BaseClass {

    private WebDriver driver;
    private LoginPage loginPage;

    
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        initializeBrowser(); // Initialize the browser
        driver.get("https://demowebshop.tricentis.com/");
        loginPage = new LoginPage(driver);
        loginPage.clickOnLoginUrl(); // Navigate to login page
    }

    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() {
        loginPage.enterUsername("validUser@example.com");
        loginPage.enterPassword("validPassword123");
    }

    @When("I enter invalid username and password")
    public void iEnterInvalidUsernameAndPassword() {
        loginPage.enterUsername("invalidUser@example.com");
        loginPage.enterPassword("wrongPassword");
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickOnLoginBtn();
    }

    @Then("I should be redirected to the homepage")
    public void iShouldBeRedirectedToTheHomepage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("homepage"), "Failed to redirect to homepage");
    }

    @Then("I should see a welcome message")
    public void iShouldSeeAWelcomeMessage() {
        Assert.assertTrue(loginPage.isWelcomeMessageDisplayed(), "Welcome message displayed");
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message not displayed");
    }
}
