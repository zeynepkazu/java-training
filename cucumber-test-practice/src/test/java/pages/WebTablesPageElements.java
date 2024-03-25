package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPageElements {

        //Form fields
        protected SelenideElement addNewRecordButton = $("#addNewRecordButton");
        protected SelenideElement registrationForm = $("#registration-form-modal");

        protected SelenideElement lastAddedEntry =  $("div[class='rt-tr-group']:last-child");

        //Declaring form fields for better readability
        protected SelenideElement firstNameField = $("#firstName");
        protected SelenideElement lastNameField = $("#lastName");
        protected SelenideElement emailField = $("#userEmail");
        protected SelenideElement ageField = $("#age");
        protected SelenideElement salaryField = $("#salary");
        protected SelenideElement departmentField = $("#department");

        //Buttons
        protected SelenideElement submitButton =  $("#submit");
        protected SelenideElement editButton = $("#edit-record-4");

}
