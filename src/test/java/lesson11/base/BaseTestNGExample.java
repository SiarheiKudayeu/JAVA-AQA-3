package lesson11.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class BaseTestNGExample {
    static WebDriver driver;
    static WebDriverWait wait;

    public static WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @BeforeClass
    public void varInit(){
        driver = DriverSetUp.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

    @Test
    public void fillContactUsPage() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        waitForElement(By.id("email")).sendKeys("mail@mail.mail");
        waitForElement(By.id("id_order")).sendKeys("12345");
        waitForElement(By.id("message")).sendKeys("message");
        waitForElement(By.id("submitMessage")).click();
        waitElement(By.cssSelector(".alert.alert-danger"));

        String alertMessageText = waitForElement(By.cssSelector(".alert.alert-danger p")).getText();
        //assertTrue
        Assert.assertTrue(alertMessageText.contains("error"), "Alert message has incorrect context");
        //assertFalse
        Assert.assertFalse(alertMessageText.contains("errors"), "Failing test message on assert false example");
        //assertEquals
        String alertMessage = waitForElement(By.cssSelector(".alert.alert-danger li")).getText();
        Assert.assertEquals(alertMessage, "Please select a subject from the list provided.");
        //assertNotEquals
        Assert.assertNotEquals(alertMessage, "Invalid email address.");
    }

    @Test
    public void fillContactUsPage2() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        waitForElement(By.id("email")).sendKeys("mail@mail.mail");
        waitForElement(By.id("id_order")).sendKeys("12345");
        waitForElement(By.id("message")).sendKeys("message");
        waitForElement(By.id("submitMessage")).click();
        waitElement(By.cssSelector(".alert.alert-danger"));
        String alertMessageText = waitForElement(By.cssSelector(".alert.alert-danger p")).getText();
        Assert.assertTrue(alertMessageText.contains("error"), "Alert message has incorrect context");
        Assert.assertFalse(alertMessageText.contains("errors"), "Failing test message on assert false example");
        String alertMessage = waitForElement(By.cssSelector(".alert.alert-danger li")).getText();
        Assert.assertEquals(alertMessage, "Please select a subject from the list provided.");
        Assert.assertNotEquals(alertMessage, "Invalid email address.");
    }

    @Ignore
    @Test
    public void fillContactUsPage3() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        waitForElement(By.id("email")).sendKeys("mail@mail.mail");
        waitForElement(By.id("id_order")).sendKeys("12345");
        waitForElement(By.id("message")).sendKeys("message");
        waitForElement(By.id("submitMessage")).click();
        waitElement(By.cssSelector(".alert.alert-danger"));
        String alertMessageText = waitForElement(By.cssSelector(".alert.alert-danger p")).getText();
        Assert.assertTrue(alertMessageText.contains("error"), "Alert message has incorrect context");
    }



    @Test(enabled = false)
    public void fillContactUsPage4() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        waitForElement(By.id("email")).sendKeys("mail@mail.mail");
        waitForElement(By.id("id_order")).sendKeys("12345");
        waitForElement(By.id("message")).sendKeys("message");
        waitForElement(By.id("submitMessage")).click();
        waitElement(By.cssSelector(".alert.alert-danger"));
        String alertMessageText = waitForElement(By.cssSelector(".alert.alert-danger p")).getText();
        Assert.assertTrue(alertMessageText.contains("error"), "Alert message has incorrect context");
    }


}
