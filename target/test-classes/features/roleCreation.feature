Feature: role creation
  Description: As a admin I want to create role with valid and invalid data so that
  I can see role created successfully message or error messages for invalid data

  Background: 
    Given user is in bank home page
    And user do login with valid credentials
    And user clicks on role button
    And user clicks on new role button

  Scenario: Role creation with valid data
    When user enters role name as "newRoleFromFeature"
    And user enters role description as "this is the role from feature file"
    And user selects role type as "E"
    And user clicks on submit button
    Then user can see a message saying role created successfully with some id

  Scenario: Role ceation with invalid rolename
		When user enters role name as "invlaid role Name"
		Then user can see an error message saying invalid role name

	Scenario: Role creation with blank rolename
		When user enters role description as "this is role with empty role name"
		And user selects role type as "E"
		And user clicks on submit button
		Then user can see an error message please Fill the following fields --Role Name