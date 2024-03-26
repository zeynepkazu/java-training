package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.*;
import pages.WebTablesPageElements;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesPageSteps extends WebTablesPageElements {

    @Given("I open the web tables page")
    public void navigateAndAssert () {
        open("https://demoqa.com/webtables");
        $("#addNewRecordButton").should(Condition.exist);
        assertThat("https://demoqa.com/webtables");
    }

    @When("I add a new record")
    public void addNewRecord() {
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
    }

    @Then("I should see the newly added record in the table")
    public void addedRecordIsVisible() {
       lastAddedEntry.shouldBe(Condition.visible);
    }

    @When("I edit the added record")
    public void editNewRecord () {
        editButton.click();

        firstNameField.clear();
        firstNameField.setValue("Jane");
        submitButton.click();
    }

    @Then("I should see the edited record in the table")
    public void theRecordShouldBeUpdated() {
        System.out.println("Field modified as: " + $(".rt-tbody > div:nth-child(4) > div > div:nth-child(1)").getText());
    }

    @AfterTest
    public void tearDown() {
    }

}


