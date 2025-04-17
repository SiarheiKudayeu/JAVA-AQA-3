package lesson11.parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class ParameterTest {
    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeClass
    @Parameters({"browser"})
    public void varInit(String browser){
        switch (browser){
            case "Edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            case "Chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void checkPageTitle(){
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
    }
}
