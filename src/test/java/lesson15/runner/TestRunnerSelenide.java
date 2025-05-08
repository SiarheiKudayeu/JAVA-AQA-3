package lesson15.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/feature_selenide"},
        glue = {"lesson15/selenide_step_definition"}
)

public class TestRunnerSelenide extends AbstractTestNGCucumberTests {
}
