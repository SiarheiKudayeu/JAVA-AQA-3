package lesson10.waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();
        driver.get(Links.LOGIN_PAGE.getLink());
        By pass = By.name("password");
        By email = By.name("email");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(InterruptedException.class);


        wait.until(ExpectedConditions.visibilityOfElementLocated(pass)).sendKeys("ABC");

        //driver.findElement(pass).sendKeys("ABC");
        wait.until(ExpectedConditions.textToBePresentInElementValue(email, "AQA"));
        driver.findElement(pass).clear();
        Thread.sleep(3000);
        driver.quit();
    }
}
