package lesson15.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/feature"},
        glue = {"lesson15/selenium_step_definition"},
        tags = "@need_to_run"
)

public class TestRunnerSelenium extends AbstractTestNGCucumberTests {
}
