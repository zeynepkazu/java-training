package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.*;
import pages.ElementsPageElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageSteps extends ElementsPageElements {

    @Given("I open the elements page")
    public void printDynamicMessageTest() {
        open("https://demoqa.com/elements");
        assertThat("https://demoqa.com/elements");

    }

    @When("I click on Buttons button")
    public void clickButtonsSection() {
        buttonsButton.click();
        assertThat("https://demoqa.com/buttons");

    }

    @And("I click on the click me button")
    public void clickButton() {
        clickMeButton.scrollTo().click();
    }

    @Then("I should see the message")

    public void iShouldSeeTheMessage() {
        dynamicMessage.shouldBe(visible);
        System.out.println(dynamicMessage.getText());
    }

    @AfterTest
    public void tearDown() {
    }

}


