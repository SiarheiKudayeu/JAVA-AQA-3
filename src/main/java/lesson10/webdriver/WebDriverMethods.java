package lesson10.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.util.List;

public class WebDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();

        //manage()
        driver.manage().window().maximize();

        //get()
        driver.get(Links.GUINNESS_APPLICATION_PAGE.getLink());

        //findElement(), findElements()
        Thread.sleep(2000);
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class=\"columned\"]"));
        int counter = 1;
        for (WebElement element : elementList) {
            System.out.println(counter + ") " + element.getText());
            counter++;
        }

        //get getCurrentUrl, getTitle, getPageSource
/*        System.out.println("Current URL is: " + driver.getCurrentUrl());
        System.out.println("Current Title is: " + driver.getTitle());
        System.out.println("Current PageSource is: " + driver.getPageSource());*/

        System.out.println("Current Title is: " + driver.getTitle());
        driver.navigate().to(Links.AUTOMATION_PRACTICE.getLink());
        Thread.sleep(1000);
        System.out.println("Current Title is: " + driver.getTitle());
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("Current Title is: " + driver.getTitle());
        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println("Current Title is: " + driver.getTitle());
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("KEYS to send!!!");
        Thread.sleep(1000);
        driver.quit();
    }
}
