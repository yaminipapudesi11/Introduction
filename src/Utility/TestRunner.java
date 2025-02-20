package Utility;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/FeatureFile",
    glue = "StepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true,
    dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
