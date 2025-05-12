package lesson16.android_test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lesson16.android.AndroidPage;
import lesson16.android.AppiumDriverInit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AndroidApplicationTest {

    AppiumDriver driver;
    AndroidPage androidPage;


    @BeforeMethod
    public void setUp(){
        driver = new AppiumDriverInit().getDriver();
        androidPage = new AndroidPage(driver);
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void clockTest(){
        androidPage.clickOnView();
        androidPage.scrollUntilTextClockAndClick();
        androidPage.checkClock();
    }
}
