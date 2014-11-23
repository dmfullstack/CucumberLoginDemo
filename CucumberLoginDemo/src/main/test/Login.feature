Feature: To test the login authentication when there re no errors

  Scenario: login form is validated when there are no errors
    Given I am on the "http://localhost:8080/CucumberLoginDemo/" link
    When I populate the username and password
    And I click on the login button
    Then I should be on the welcome page
