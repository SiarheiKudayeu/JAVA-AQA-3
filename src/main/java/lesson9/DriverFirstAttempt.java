package lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFirstAttempt {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/records/");

        Thread.sleep(1000);

        //id
        driver.findElement(By.id("search")).click();
        Thread.sleep(1000);

        //name
        driver.findElement(By.name("publicSearchBar")).sendKeys("Handstand push ups");

        //className
        Thread.sleep(1000);
        driver.findElement(By.className("green-background")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("green-background")).click();
        driver.findElement(By.name("publicSearchBar")).sendKeys(Keys.ENTER);

        //tag name
        Thread.sleep(2000);
        String searchResultValue = driver.findElement(By.tagName("h2")).getText();
        System.out.println(searchResultValue);

        //linkText
        driver.get("https://www.guinnessworldrecords.com/records/");
        driver.findElement(By.linkText("RECORDS SHOWCASE")).click();
        Thread.sleep(3000);

        //partialLinkText
        driver.get("https://www.guinnessworldrecords.com/records/");
        driver.findElement(By.partialLinkText("LICATION PRO")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
