package lesson10.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utils.driver.DriverSetUp;
import utils.urls.Links;

public class WindowHandleExample {
    public static void main(String[] arg) throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        String windowHandleAuto = driver.getWindowHandle();

        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(Links.GUINNESS_APPLICATION_PAGE.getLink());
        String windowHandleGuinness = driver.getWindowHandle();
        System.out.println(windowHandleGuinness + " "+driver.getCurrentUrl());

        driver.switchTo().window(windowHandleAuto);
        System.out.println(windowHandleAuto + " "+driver.getCurrentUrl());
        driver.quit();
    }
}
