package lesson11.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class DataProviderTest {

    public static WebElement waitForElement(By locator, WebDriverWait wait) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitElement(By locator, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][]{
                {"mail@mail.mail5", 12345, "message5"},
                {"mail@mail.mail1", 12345, "message1"},
                {"mail@mail.mail2", 12345, "message2"},
                {"mail@mail.mail3", 12345, "message3"},
                {"mail@mail.mail4", 12345, "message4"},
        };
    }

    @Test(dataProvider = "testData")
    public void fillContactUsPage(String email, int orderId, String message) {
        WebDriver driver = DriverSetUp.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        waitForElement(By.id("email"), wait).sendKeys(email);
        waitForElement(By.id("id_order"), wait).sendKeys(String.valueOf(orderId));
        waitForElement(By.id("message"), wait).sendKeys(message);
        waitForElement(By.id("submitMessage"), wait).click();
        waitElement(By.cssSelector(".alert.alert-danger"), wait);
        String alertMessageText = waitForElement(By.cssSelector(".alert.alert-danger p"), wait).getText();
        Assert.assertTrue(alertMessageText.contains("error"), "Alert message has incorrect context");
        Assert.assertFalse(alertMessageText.contains("errors"), "Failing test message on assert false example");
        String alertMessage = waitForElement(By.cssSelector(".alert.alert-danger li"), wait).getText();
        Assert.assertEquals(alertMessage, "Please select a subject from the list provided.");
        Assert.assertNotEquals(alertMessage, "Invalid email address.");
        driver.quit();
    }
}
