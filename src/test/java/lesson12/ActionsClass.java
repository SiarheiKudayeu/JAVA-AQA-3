package lesson12;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.driver.DriverSetUp;
import utils.urls.Links;

import java.time.Duration;

public class ActionsClass {
    static WebDriver driver;
    static WebDriverWait wait;
    static Actions actions;

    private static class Locators {
        private static By techStack = By.xpath("//*[@id='Tech Stack']");
        private static By frontEnd = By.xpath("//span[text()='Front-end Development']");
        private static By angular = By.xpath("//span[text()='Angular']");
        private static By vue = By.xpath("//span[text()='Vue']");
        private static By react = By.xpath("//span[text()='React']");
        private static By menuButton = By.xpath("//*[@id='menu-btn']");
        private static By greenButton = By.xpath("//*[@id='option2']");
        private static By orangeButton = By.xpath("//*[@id='option1']");
        private static By rightClickButton = By.cssSelector(".context-menu-one.btn");
        private static By doubleClickButton = By.xpath("//button[@ondblclick=\"myFunction()\"]");
        private static By quitButton = By.xpath("//span[text()='Quit']");
    }

    public enum Stack {
        FRONT_END, ANGULAR, VUE, REACT
    }

    public static void checkStackRedirection(Stack stack) {
        By locatorOfStack = null;
        String assertString = null;
        switch (stack) {
            case REACT -> {
                locatorOfStack = Locators.react;
                assertString = "React Development";
            }
            case VUE -> {
                locatorOfStack = Locators.vue;
                assertString = "Vue.js Development";
            }
            case FRONT_END -> {
                locatorOfStack = Locators.frontEnd;
                assertString = "Front-end Development";
            }
            case ANGULAR -> {
                locatorOfStack = Locators.angular;
                assertString = "Angular Development";
            }
        }
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.techStack));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Locators.techStack)).perform();
        actions.moveToElement(driver.findElement(locatorOfStack)).click().build().perform();
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }

        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains(assertString),
                "We expected text: " + driver.findElement(By.tagName("h1")).getText() +
                        "\ncontains: " + assertString);
    }

    @BeforeMethod
    public void setUpDriver() {
        driver = DriverSetUp.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void openTechStack() throws InterruptedException {
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.techStack));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Locators.techStack)).perform();
        actions.moveToElement(driver.findElement(Locators.frontEnd)).click().build().perform();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("Front-end Development"),
                "We expected text: " + driver.findElement(By.tagName("h1")).getText() +
                        "\ncontains Front-end Development");
    }

    @Test
    public void checkAllStack() {
        var values = Stack.values();
        for (Stack stack : values) {
            checkStackRedirection(stack);
        }
    /*    checkStackRedirection(Stack.ANGULAR);
        checkStackRedirection(Stack.FRONT_END);
        checkStackRedirection(Stack.VUE);
        checkStackRedirection(Stack.REACT);*/
    }

    @Test
    public void upAndDownKey() {
        driver.get(Links.ANDERSEN.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.techStack));
        actions.moveToElement(driver.findElement(Locators.techStack))
                .moveToElement(driver.findElement(Locators.frontEnd))
                .keyDown(Keys.CONTROL)
                .click()
                .keyUp(Keys.CONTROL)
                .pause(Duration.ofSeconds(4))
                .build().perform();
    }

    @Test
    public void dragAndDropTest() {
        driver.get(Links.DRAG_AND_DROP_PAGE.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.menuButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.greenButton));

/*        actions.pause(Duration.ofSeconds(4))
                .moveToElement(driver.findElement(Locators.greenButton))
                .clickAndHold()
                .moveToElement(driver.findElement(Locators.menuButton))
                .release()
                .pause(Duration.ofSeconds(4))
                .build().perform();*/

        actions.pause(Duration.ofSeconds(4))
                .dragAndDrop(driver.findElement(Locators.orangeButton), driver.findElement(Locators.menuButton))
                .build().perform();

    }

    @Test
    public void doubleAndContext() throws InterruptedException {
        driver.get(Links.DOUBLE_AND_CONTEXT.getLink());
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.rightClickButton));
        actions.contextClick(driver.findElement(Locators.rightClickButton)).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quitButton)).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText() + ": text from our right click alert!!!");
        alert.accept();

        actions.doubleClick(driver.findElement(Locators.doubleClickButton)).perform();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText() + ": text from our double click alert!!!");
        alert.accept();
    }

    @Test
    public void iframeTest(){
        driver.get(Links.IFRAME_PAGE.getLink());
        WebElement iframe1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='iframeResult']")));
        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElement(By.tagName("h2")).getText());
/*        WebElement iframe2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@src=\"demo_iframe.htm\"]")));
        driver.switchTo().frame(iframe2);*/
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src=\"demo_iframe.htm\"]")));
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("h2")).getText());;
        driver.switchTo().defaultContent();
    }

    @Test
    public void JavaScriptExecutorTest() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(Links.GUINNESS_SEARCH.getLink());
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.id("search"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(4000);
        String pageTitle = (String) js.executeScript("return document.title;");
        String pageURL = (String) js.executeScript("return document.URL;");
        System.out.println(pageTitle);
        System.out.println(pageURL);
    }
}
