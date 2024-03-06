package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:features"},
        tags = "@urlTest",
        glue = {"stepDefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json" ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//

public class MainRunner extends AbstractTestNGCucumberTests {

}

