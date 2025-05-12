package android_package;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverInit {
    AppiumDriver driver;

    public AppiumDriver getDriver() {
        try {
            driver = initDriver();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return this.driver;
    }


    private AppiumDriver initDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("15.0");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity(".ApiDemos");
        options.setAutomationName("UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        return driver;
    }

}
