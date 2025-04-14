package lesson10.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.util.Set;

public class WindowHandle2 {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.getDriver();
        driver.get(Links.AUTOMATION_PRACTICE.getLink());

        Set<String> windowHandles = driver.getWindowHandles();

        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> windowHandlesBoth = driver.getWindowHandles();
        windowHandlesBoth.removeAll(windowHandles);
        String newWindowHandle = windowHandlesBoth.iterator().next();
        driver.switchTo().window(newWindowHandle);
        driver.get(Links.GUINNESS_APPLICATION_PAGE.getLink());

        driver.quit();
    }
}
