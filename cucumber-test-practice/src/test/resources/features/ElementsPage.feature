Feature: Verify clicking on the "Click Me" button in the Buttons section of demoqa.com and see the dynamic message

  Scenario: Click on "Click Me" button and read the message
    Given I open the elements page
    When I click on Buttons button
    And I click on the click me button
    Then I should see the message
