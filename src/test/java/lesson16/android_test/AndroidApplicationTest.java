package lesson16.android_test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import lesson16.android.AppiumDriverInit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AndroidApplicationTest {
    //Views //TextClock //android.widget.TextView[4]
    AppiumDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new AppiumDriverInit().getDriver();
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }

    @Test
    public void clockTest(){
        System.out.println("Hello");
        System.out.println();
    }
}
