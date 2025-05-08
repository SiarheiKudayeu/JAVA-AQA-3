package lesson15.selenide_step_definition;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import utils.urls.Links;

import static com.codeborne.selenide.Selenide.*;

public class SelenideStepDefinitions {

    private static final SelenideElement select = $(By.id("id_contact"));
    private static final SelenideElement email = $(By.id("email"));
    private static final SelenideElement id_order = $(By.id("id_order"));
    private static final SelenideElement message = $(By.id("message"));
    private static final SelenideElement submitMessage = $(By.id("submitMessage"));
    private static final SelenideElement successMessage = $(By.cssSelector(".alert.alert-success"));


    @Given("Set up driver Selenide")
    public void set_up_driver_selenide() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
    }
    @When("Opening Contact Us Page Selenide")
    public void opening_contact_us_page_selenide() {
      open(Links.AUTOMATION_PRACTICE.getLink());
    }

    @When("set email Selenide {string}")
    public void set_email_selenide(String string) {
        email.setValue(string);
    }
    @When("select subject heading Selenide")
    public void select_subject_heading_selenide() {
        select.selectOptionContainingText("Customer service");
    }
    @When("set order id Selenide")
    public void set_order_id_selenide() {
        id_order.setValue("12345");
    }

    @When("insert message Selenide")
    public void insert_message_selenide() {
        message.setValue("MESSAGE!");
    }
    @When("click on send button Selenide")
    public void click_on_send_button_selenide() {
        submitMessage.click();
    }
    @Then("check success message Selenide")
    public void check_success_message_selenide() {
        successMessage.shouldBe(Condition.text("Your message has been successfully sent to our team."));
    }
    @Then("quit driver Selenide")
    public void quit_driver_selenide() {
        closeWebDriver();
    }
}
