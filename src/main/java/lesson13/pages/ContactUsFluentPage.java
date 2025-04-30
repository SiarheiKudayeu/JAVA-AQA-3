package lesson13.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.urls.Links;

import java.time.Duration;

public class ContactUsFluentPage {

    public ContactUsFluentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    private static WebDriver driver;
    private static WebDriverWait wait;

    @FindBy(id = "id_contact")
    private static WebElement select;

    @FindBy(id = "email")
    private static WebElement email;

    @FindBy(id = "id_order")
    private static WebElement id_order;

    @FindBy(id = "fileUpload")
    private static WebElement fileUpload;

    @FindBy(id = "message")
    private static WebElement message;

    @FindBy(id = "submitMessage")
    private static WebElement submitMessage;

    @FindBy(css = ".alert.alert-success")
    private static WebElement successMessage;


    public enum SubjectHeading {
        CUSTOM_SERVICE, WEBMASTER
    }

    public ContactUsFluentPage uploadFile(String pathToFile) {
        fileUpload.sendKeys(pathToFile);
        return this;
    }

    public ContactUsFluentPage clickOnSubmitButton() {
        wait.until(ExpectedConditions.visibilityOf(submitMessage)).click();
        return this;
    }

    public void checkSuccessMessage() {
        String expectedAlertMessage = "Your message has been successfully sent to our team.";
        String actualAlertMessage = wait.until(ExpectedConditions.visibilityOf(successMessage)).getText();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Success message is incorrect...");
    }

    public ContactUsFluentPage selectSubjectHeading(SubjectHeading subject) {
        WebElement element = select;
        Select subjectSelect = new Select(element);
        switch (subject) {
            case WEBMASTER -> subjectSelect.selectByValue("1");
            case CUSTOM_SERVICE -> subjectSelect.selectByValue("2");
        }
        return this;
    }

    public ContactUsFluentPage openContactUsPage() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        return this;
    }

    public ContactUsFluentPage setEmail(String value) {
        sendKeys(email, value);
        return this;
    }

    public ContactUsFluentPage setOrderId(String value) {
        sendKeys(id_order, value);
        return this;
    }

    public ContactUsFluentPage setMessage(String value) {
        sendKeys(message, value);
        return this;
    }

    public void sendKeys(WebElement locator, String text) {
        wait.until(ExpectedConditions.visibilityOf(locator)).sendKeys(text);
    }

}
