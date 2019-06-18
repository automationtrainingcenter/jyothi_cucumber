Feature: login test
  Description: As a admin I want to do login so that I can see Welcome Admin message
  with logout link

  Background: 
    Given user is in bank home page

  Scenario: Login with valid credentials
    When user enters valid username
    And user enter valid password
    And user clicks on login button
    Then user can see welcome to admin message with logout link

  Scenario: Login with invalid password
    When user enters valid username
    But user enters invalid password
    And user clicks on login button
    Then user can see an error message saying invalid banker name or password

  Scenario: Login with invalid username
    When user enters invalid username
    And user enter valid password
    And user clicks on login button
    Then user can see an error message saying invalid banker name or password
