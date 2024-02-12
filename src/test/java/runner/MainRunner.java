package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:features"},
        tags = "@functional2",
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})

public class MainRunner extends AbstractTestNGCucumberTests {

}
