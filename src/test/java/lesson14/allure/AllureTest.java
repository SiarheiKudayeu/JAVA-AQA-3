package lesson14.allure;

import io.qameta.allure.*;
import lesson13.pages.ContactUsFluentPage;
import lesson13.pages.ContactUsPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.driver.DriverSetUp;
import utils.listeners.MyTestListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class AllureTest {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static ContactUsPage contactUsPage;
    private static ContactUsFluentPage contactUsFluentPage;

    public static void takeScreenshot(WebDriver driver, String methodName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        try {
            String screenshotPath = "target/allure-results/screenshot-" + methodName + ".png";
            FileUtils.copyFile(source, new File(screenshotPath));

            Allure.addAttachment("Screenshot for " + methodName, new FileInputStream(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void makeScreenshotIfTestFailed(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            takeScreenshot(DriverSetUp.getDriver(), result.getMethod().getMethodName());
        }
    }

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

    @Description("This is passing tests of contact us form")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Epic 1")
    @Story("US 1.1")
    @TmsLink("16")
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

    @Description("This is failing tests of contact us form")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Epic 2")
    @Story("US 2.1")
    @TmsLink("13")
    @Test
    public void contactUsPositiveCaseWithPageObjectFluent() {
        contactUsFluentPage
                .openContactUsPage()
                .setEmail("fsdf@dsfds.wew");
        Assert.fail();
        contactUsFluentPage.selectSubjectHeading(ContactUsFluentPage.SubjectHeading.WEBMASTER)
                .setOrderId("12345")
                .uploadFile("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt")
                .setMessage("MESSAGE")
                .clickOnSubmitButton()
                .checkSuccessMessage();
    }
}
