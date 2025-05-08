package lesson15.selenium_step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import lesson13.pages.ContactUsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.urls.Links;

import java.time.Duration;

public class StepDefinitionsSeleniumClass {


    private static WebDriver driver;
    private static WebDriverWait wait;



    By select = By.id("id_contact");
    By email = By.id("email");
    By id_order = By.id("id_order");
    By fileUpload = By.id("fileUpload");
    By message = By.id("message");
    By submitMessage = By.id("submitMessage");
    By successMessage = By.cssSelector(".alert.alert-success");


    public void checkSuccessMessageMethod(){
        String expectedAlertMessage = "Your message has been successfully sent to our team.";
        String actualAlertMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage,"Success message is incorrect...");
    }


    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }



    @Given("Set up driver")
    public void set_up_driver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @When("Opening Contact Us Page")
    public void opening_contact_us_page() {
        driver.get(Links.AUTOMATION_PRACTICE.getLink());
    }
    @And("set email {string}")
    public void set_email(String text) {
        sendKeys(email, text);
    }
    @And("select subject heading")
    public void select_subject_heading() {
        WebElement element = driver.findElement(select);
        Select subjectSelect = new Select(element);
        subjectSelect.selectByValue("1");
    }

    @And("set order id")
    public void set_order_id() {
        sendKeys(id_order, "12345");
    }
    @And("upload file")
    public void upload_file() {
        driver.findElement(fileUpload).sendKeys("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt");
    }
    @And("insert message")
    public void insert_message() {
        sendKeys(message,"MESSAGE!");
    }
    @And("click on send button")
    public void click_on_send_button() {
        driver.findElement(submitMessage).click();
    }
    @Then("check success message")
    public void check_success_message() {
        checkSuccessMessageMethod();
    }
    @Then("quit driver")
    public void quit_driver() {
        driver.quit();
    }
}
