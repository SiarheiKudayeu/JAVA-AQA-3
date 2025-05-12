package lesson16.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AndroidPage {
    AppiumDriver driver;
    WebDriverWait wait;

    public AndroidPage(AppiumDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private static final class Locators{
        private static final By views = AppiumBy.accessibilityId("Views");
        private static final By textClock = AppiumBy.accessibilityId("TextClock");
        private static final By timer = By.xpath("//android.widget.TextView[4]");
    }

    public void clickOnView(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.views)).click();
    }

    public void scrollUntilTextClockAndClick(){
        WebElement element =  driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"TextClock\"))"));
        element.click();
    }

    public void checkClock(){
        Integer firstTime = Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.timer))
                .getText().split(":")[2].split("\\s")[0]);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Integer secondTime = Integer.parseInt(wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.timer))
                .getText().split(":")[2].split("\\s")[0]);

        int actualResult = secondTime - firstTime;
        Assert.assertEquals(actualResult, 5, "Our TextClock works incorrect");

    }


}
