package lesson13.page_object_test;

import lesson13.pages.ContactUsFluentPage;
import lesson13.pages.ContactUsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class ContactUsPageTest {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static ContactUsPage contactUsPage;
    private static ContactUsFluentPage contactUsFluentPage;

    @BeforeClass
    public void setUp() {
        driver = DriverSetUp.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        contactUsPage = new ContactUsPage(driver);
        contactUsFluentPage = new ContactUsFluentPage(driver);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }

    By select = By.id("id_contact");
    By email = By.id("email");
    By id_order = By.id("id_order");
    By fileUpload = By.id("fileUpload");
    By message = By.id("message");
    By submitMessage = By.id("submitMessage");
    By successMessage = By.cssSelector(".alert.alert-success");

    @Test
    public void contactUsPositiveCase() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("fsdf@dsfds.wew");
        new Select(driver.findElement(select)).selectByValue("2");
        driver.findElement(id_order).sendKeys("12345");
        driver.findElement(fileUpload).sendKeys("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt");
        driver.findElement(message).sendKeys("MESSAGE");
        driver.findElement(submitMessage).click();
        String expectedAlertMessage = "Your message has been successfully sent to our team.";
        String actualAlertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Success message is incorrect...");
    }

    @Test
    public void contactUsPositiveCaseWithPageObject() {
        contactUsPage.openContactUsPage();
        contactUsPage.setEmail("fsdf@dsfds.wew");
        contactUsPage.selectSubjectHeading(ContactUsPage.SubjectHeading.WEBMASTER);
        contactUsPage.setOrderId("12345");
        contactUsPage.uploadFile("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt");
        contactUsPage.setMessage("MESSAGE");
        contactUsPage.clickOnSubmitButton();
        contactUsPage.checkSuccessMessage();
    }

    @Test
    public void contactUsPositiveCaseWithPageObjectFluent() {
        contactUsFluentPage
                .openContactUsPage()
                .setEmail("fsdf@dsfds.wew")
                .selectSubjectHeading(ContactUsFluentPage.SubjectHeading.WEBMASTER)
                .setOrderId("12345")
                .uploadFile("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt")
                .setMessage("MESSAGE")
                .clickOnSubmitButton()
                .checkSuccessMessage();
    }
}
