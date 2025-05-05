package lesson13.pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.urls.Links;

import java.time.Duration;

public class ContactUsPage {
    public ContactUsPage(WebDriver driver) {
       this.driver = driver;
       wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    private static WebDriver driver;
    private static WebDriverWait wait;

    protected Logger logger = LogManager.getLogger(this.getClass());


    By select = By.id("id_contact");
    By email = By.id("email");
    By id_order = By.id("id_order");
    By fileUpload = By.id("fileUpload");
    By message = By.id("message");
    By submitMessage = By.id("submitMessage");
    By successMessage = By.cssSelector(".alert.alert-success");


    public enum SubjectHeading{
        CUSTOM_SERVICE, WEBMASTER
    }

    public void uploadFile(String pathToFile){
        driver.findElement(fileUpload).sendKeys(pathToFile);
    }

    public void clickOnSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitMessage)).click();
    }

    public void checkSuccessMessage(){
        String expectedAlertMessage = "Your message has been successfully sent to our team.";
        String actualAlertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage,"Success message is incorrect...");
    }

    public void selectSubjectHeading(SubjectHeading subject){
        WebElement element = driver.findElement(select);
        Select subjectSelect = new Select(element);
        switch (subject){
            case WEBMASTER -> subjectSelect.selectByValue("1");
            case CUSTOM_SERVICE -> subjectSelect.selectByValue("2");
        }
        logger.debug("I have been chosen " + subject + " value!");
    }

    @Step("Select heading from Page")
    public void openContactUsPage(){
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        logger.info("I have been opened " + Links.AUTOMATION_PRACTICE.getLink() + " value!");
    }
    @Step("Setting Email")
    public void setEmail(String value){
        logger.warn("Trying to use valid email");
        sendKeys(email, value);
    }

    @Step("Setting order id")
    public void setOrderId(String value){
        sendKeys(id_order, value);
    }

    public void setMessage(String value){
        sendKeys(message, value);
        logger.error("SOME ERROR!!!");
    }

    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

}
