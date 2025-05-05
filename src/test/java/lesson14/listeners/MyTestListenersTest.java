package lesson14.listeners;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.listeners.MyTestListener;
import utils.urls.Links;

import java.time.Duration;
@Listeners({MyTestListener.class})
public class MyTestListenersTest {
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
        Assert.fail();
    }
}
