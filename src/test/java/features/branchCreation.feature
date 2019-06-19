@branch
Feature: branch creation
  Description: As a admin I want to test branch reset with multiple sets of data
  so that I can see an empty branch creation form

  Background: 
    Given user is in bank home page
    And user do login with valid credentials
    And user clicks on branch button
    And user clicks on new branch button
    
   @reset_json
   Scenario: verify branch creation reset with multiple sets of data from json file
   	When user clicks on reset button after filling branch creation form using json data
   	Then user can see an empty form
