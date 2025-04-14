package lesson10.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.util.List;

public class WebElementClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();
        //sendKeys, click, clear
/*        driver.get(Links.GUINNESS_SEARCH.getLink());

        WebElement searchField = driver.findElement(By.xpath("//*[@name=\"publicSearchBar\"]"));
        searchField.sendKeys("AQA check");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]"));
        searchButton.click();
        Thread.sleep(2000);

        searchField = driver.findElement(By.xpath("//*[@name=\"publicSearchBar\"]"));
        searchField.clear();
        Thread.sleep(2000);*/

        //get info from element
   /*     By cssSelector = By.cssSelector(".btn.btn-icon");
        driver.get(Links.GUINNESS_APPLICATION_PAGE.getLink());
        WebElement element = driver.findElement(cssSelector);
        System.out.println("Text from element " + element.getText());
        System.out.println("Tag name from element " + element.getTagName());
        System.out.println("Attribute name from element " + element.getAttribute("target"));
        System.out.println("Css value name from element " + element.getCssValue("background-color"));

        System.out.println("========COORDINATES==========");
        System.out.println("COORDINATES from element " + element.getLocation());
        System.out.println("COORDINATE X from element " + element.getLocation().x);
        System.out.println("COORDINATE Y from element " + element.getLocation().y);

        System.out.println("========SIZE==========");
        System.out.println("SIZE OF element " + element.getSize());
        System.out.println("SIZE width from element " + element.getSize().width);
        System.out.println("SIZE height from element " + element.getSize().height);*/

        //isDisplayed, isSelected, isEnabled
        driver.get(Links.AUTO_COMPARE_PAGE.getLink());
        Thread.sleep(3000);
        WebElement checkBox = driver.findElement(By.xpath("//*[@id='layered_category_4']"));
        WebElement compareButton = driver.findElement(By.xpath("(//*[@method=\"post\"]//*[@type=\"submit\"])[1]"));
        WebElement contactUsButton = driver.findElement(By.xpath("//*[@title=\"Contact us\"]"));

        System.out.println("isSelected before clicking: " + checkBox.isSelected());
        checkBox.click();
        System.out.println("isSelected after clicking: " + checkBox.isSelected());

        System.out.println("isEnabled on not enabled compare button: " + compareButton.isEnabled());
        System.out.println("isEnabled on enabled contact us button: " + contactUsButton.isEnabled());

        System.out.println("isDisplayed before redirect compare button: " + compareButton.isDisplayed());
        contactUsButton.click();
        Thread.sleep(2000);

        //List<WebElement> elementList = driver.findElements(By.xpath("(//*[contains(text(),\"Compare (\")])[1]"));

        System.out.println("isDisplayed after redirect compare button: " + checkThatElementIsNotDisplayed(By.xpath("(//*[contains(text(),\"Compare (\")])[1]")));
        driver.quit();
    }

    public static boolean checkThatElementIsNotDisplayed(By locator){
        return !DriverSetUp.getDriver().findElements(locator).isEmpty();
    }
}
