package org.example.tests;

import org.example.drivers.Driver;
import org.example.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;


public class UiTestPractice {
    public static WebDriver driver;
    WebDriverWait waitDriver;
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

    @BeforeTest()
    public void setUp() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test
    public void openWebTables() {
        Assert.assertEquals(url, "https://demoqa.com/webtables");
    }

    @Test
    public void submitAndEditNewEntry() {
        WebElement addButton = driver.findElement(By.cssSelector("#addNewRecordButton"));
        ScrollToElement.scrollToElement(driver, addButton);
        addButton.click();

        //Wait until form is visible and fill in the fields
        waitDriver = new WebDriverWait(driver, Duration.ofSeconds(300));
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.id("registration-form-modal")));
        WebElement firstNameField = driver.findElement(By.cssSelector("#firstName"));
        firstNameField.sendKeys("James");

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.sendKeys("Joyce");

        WebElement emailField = driver.findElement(By.cssSelector("#userEmail"));
        emailField.sendKeys("james.joyce@example.com");

        WebElement ageField = driver.findElement(By.cssSelector("#age"));
        ageField.sendKeys("30");

        WebElement salaryField = driver.findElement(By.cssSelector("#salary"));
        salaryField.sendKeys("50000");

        WebElement departmentField = driver.findElement(By.cssSelector("#department"));
        departmentField.sendKeys("IT");

        // Click the "Submit" button
        WebElement submitButton = driver.findElement(By.cssSelector("#submit"));
        submitButton.click();

        // Find the row containing the newly added entry
        WebElement editButton = driver.findElement(By.cssSelector("#edit-record-4"));
        editButton.click();

        // Modify the values in the form fields
        WebElement updatedFirstNameField = driver.findElement(By.cssSelector("#firstName"));
        updatedFirstNameField.clear();
        updatedFirstNameField.sendKeys("Jane");

        WebElement updateSubmitButton = driver.findElement(By.cssSelector("#submit"));
        updateSubmitButton.click();

        WebElement updatedFirstNameCell = driver.findElement((By.cssSelector("div.rt-tbody > div:nth-child(4) > div > div:nth-child(1)")));
        System.out.println("Field modified as:" + " " + updatedFirstNameCell.getText());
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}





