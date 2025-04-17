package utils.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class DriverSetUp {
    private static WebDriver driver;

    private static WebDriver setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static boolean isDriverInvalid() {
        try {
            return driver == null || ((RemoteWebDriver) driver).getSessionId() == null;
        } catch (Exception e) {
            return true;
        }
    }

    private static WebDriver getInstance() {
        if (isDriverInvalid()) {
            driver = setUpDriver();
        }
        return driver;
    }

    public static WebDriver getDriver(){
        driver = getInstance();
        return driver;
    }
}
