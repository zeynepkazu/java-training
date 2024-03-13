package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.*;
import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWebTableTest extends PageElements {
    //added timeout so that the tests will not fail due to a timeout error
    @BeforeTest
    public void setUp() {
        Configuration.timeout = 50000;
    }

    @Test
    public void navigateAndAssert () {
        open("https://demoqa.com/webtables");
        $("#addNewRecordButton").should(Condition.exist);
        assertThat("https://demoqa.com/webtables");
    }


    @Test
    public void submitAndEditNewEntry() {
        open("https://demoqa.com/webtables");

        addNewRecordButton.scrollTo().click();

        registrationForm.shouldBe(Condition.visible);

        //Setting form fields
        firstNameField.setValue("James");
        lastNameField.setValue("Joyce");
        emailField.setValue("james.joyce@example.com");
        ageField.setValue("30");
        salaryField.setValue("50000");
        departmentField.setValue("IT");

        submitButton.click();

        editButton.click();

        //Editing the new record
        firstNameField.clear();
        firstNameField.setValue("Jane");
        submitButton.click();

        System.out.println("Field modified as: " + $(".rt-tbody > div:nth-child(4) > div > div:nth-child(1)").getText());
    }

    @AfterTest
    public void tearDown() {
    }
}
