package lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAndXpathLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/records/");
        Thread.sleep(1000);


        // XPATH
        // xpath ->  //tag_name[@attribute_name = 'attribute_value']
        System.out.println(driver.findElement(By.xpath("//a[@alt=\"RECORDS SHOWCASE\"]")).getText());
        driver.findElement(By.xpath("//a[@id=\"search\"]")).click();

        Thread.sleep(2000);
        // xpath search by text
        System.out.println(driver.findElement(By.xpath("//button[text()='Search']")).getText());

        // xpath with part of attribute -> //a[contains(@alt,'PPLICATION PR')]
        // xpath with part of text ->//a[contains(text(),'PPLICATION PR')]
        // xpath with multiple attributes -> //a[contains(@href,'e-application-pr')][@alt="APPLICATION PROCESS"]

        // /html/body/main/nav[2]/div[2]/a

        //  //nav[contains(@class,"secondary_menu_wrapper no-margi")]//*[@alt="APPLY"]

        // /tag_name, /child::tag_name -> move for child element
        // /.., /parent::tag_name -> move to parent element
        // /following-sibling::div -> move for parallel element



        //CSS SELECTOR
        //id
        By id = By.cssSelector("#search");
        //tagName
        By tagName = By.cssSelector("h2");
        //className
        By className = By.cssSelector(".useraccount2.orange-background");
        //tag_name[attribute='attribute_value']
        By attribute = By.cssSelector("a[title=\"Account\"]");


        //We can mix ccs arguments -> a.useraccount2.orange-background[title="Account"]

        driver.quit();
    }
}
