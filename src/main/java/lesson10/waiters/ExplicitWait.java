package lesson10.waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();
        driver.get(Links.LOGIN_PAGE.getLink());
        By pass = By.name("password");
        By email = By.name("email");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(pass)).sendKeys("ABC");
        //driver.findElement(pass).sendKeys("ABC");
        wait.until(ExpectedConditions.textToBePresentInElementValue(email, "AQA"));
        driver.findElement(pass).clear();
        Thread.sleep(3000);
        driver.quit();
    }
}
