package org.example.tests;

import org.example.drivers.Driver;
import org.example.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;


public class UITestPractice {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager = new PropertyManager();
    String url = propertyManager.getProperty("APP_URL");

    // class with the method to use in case web elements overlap.
    public class ScrollToElement {
        public static void scrollToElement (WebDriver driver, WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        }
    }

    @BeforeTest ()
    public void setUp () throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test
    public void openDemoTest() {
        Assert.assertEquals(url,"https://demoqa.com/elements");
    }

    @Test
    public void clickButton ()  {
        WebElement buttonsButton = driver.findElement(By.cssSelector("#item-4"));
        buttonsButton.click();
    }

    @Test
    public void assertButtonsUrl ()  {
        String buttonsUrl = "https://demoqa.com/buttons";
        Assert.assertEquals(buttonsUrl,"https://demoqa.com/buttons");
    }

    @Test
    public void clickClickMeButton ()  {
            WebElement clickMeButton = driver.findElement(By.cssSelector(".col-md-6 div:nth-of-type(3) > .btn"));
            ScrollToElement.scrollToElement(driver, clickMeButton);
            clickMeButton.click();
        }

    @Test
    public void printDynamicMessage ()  {
        WebElement dynamicMessage = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        System.out.println(dynamicMessage.getText());
    }
    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
