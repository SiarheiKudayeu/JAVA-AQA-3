package lesson11.parallel.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class ParallelClassesTwo {
    WebDriver driver;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void checkPageTitle1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
    }

    @Test
    public void checkPageTitle2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
    }

    @Test
    public void checkPageTitle3(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
    }

    @Test
    public void checkPageTitle4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
    }
}
