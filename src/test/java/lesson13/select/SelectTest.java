package lesson13.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class SelectTest {
    @Test
    public void selectTextMethod() throws InterruptedException {
        WebDriver driver = DriverSetUp.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(Links.SELECT_PAGE.getLink());
        WebElement countrySelectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
        Select countrySelect = new Select(countrySelectElement);
        Select animalSelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("animals"))));

        //isMultiple()
        System.out.println("Country select is multiple? " + countrySelect.isMultiple());
        System.out.println("Animal select is multiple? " + animalSelect.isMultiple());

        //Options
        var listOfOptions = countrySelect.getOptions();
        int counter = 1;
        for (WebElement countryOption : listOfOptions) {
            System.out.println(counter + ") " + countryOption.getText());
            counter++;
        }

        //selectingValues
        countrySelect.selectByValue("japan");
        animalSelect.selectByVisibleText("\n" +
                "        Rabbit\n" +
                "      ");
        animalSelect.selectByValue("dog");
        animalSelect.selectByValue("giraffe");
        //deselect
        Thread.sleep(4000);
        animalSelect.deselectByValue("giraffe");
        counter = 1;
        System.out.println("SELECTED ANIMALS:\n");
        for (WebElement element : animalSelect.getAllSelectedOptions()) {
            System.out.println(counter + ") " + element.getText());
            counter++;
        }

        driver.quit();
    }
}
