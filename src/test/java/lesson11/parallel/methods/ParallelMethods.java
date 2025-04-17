package lesson11.parallel.methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.urls.Links;

import java.time.Duration;

public class ParallelMethods {

    @Test
    public void checkPageTitle1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle5(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle6(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle7(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }

    @Test
    public void checkPageTitle8(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.titleContains("Andersen"));
        Assert.assertEquals(driver.getTitle(), "Andersen: Software Development Company");
        driver.quit();
    }
}
