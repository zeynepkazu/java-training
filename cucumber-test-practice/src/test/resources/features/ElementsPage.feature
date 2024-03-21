Feature: As a user I want to click buttons on the Buttons section of the Elements page

  Scenario: Click on "Click Me" button and read the message
    Given I open the elements page
    When I click on Buttons button
    And I click on the click me button
    Then I should see the message
