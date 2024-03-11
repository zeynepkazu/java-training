package tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideTest {

    @Test
    public void printDynamicMessageTest() {
        open("https://demoqa.com/elements");
        assertThat("https://demoqa.com/elements");

        SelenideElement buttonsButton = $(byId("item-4"));
        buttonsButton.click();
        assertThat("https://demoqa.com/buttons");

        SelenideElement clickMeButton = $(byCssSelector(".col-md-6 div:nth-of-type(3) > .btn"));
        clickMeButton.scrollTo().click();
        System.out.println($(byId("dynamicClickMessage")).getText());
    }

    @AfterTest
    public void tearDown() {
    }
}