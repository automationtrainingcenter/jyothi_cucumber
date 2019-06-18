Feature: employee creation
  Description: As a admin I want to create employee with valid and invalid data so that
  I can see employee created successfully for valid data and error messages for invalid data

  Background: 
    Given user is in bank home page
    And user do login with valid credentials
    And user clicks on employee button
    And user clicks on new employee button

  #Scenario Outline: employee creation with valid data
    #When user enters employee name "<empName>"
    #And user enters login password "<loginPass>"
    #And user selects role name "<roleName>"
    #And user selects role type "<roleType>"
    #And user click on submit button
    #Then user can see a message as Employee created successfully with some id
#
    #Examples: 
      #| empName       | loginPass | roleName | roleType |
      #| employeeONE   | password  | manager  | abcde    |
      #| employeeTWO   | password  | manager  | abcde    |
      #| employeeTHREE | password  | manager  | abcde    |
      #| employeeFOUR  | password  | manager  | abcde    |

  Scenario: employee creation with invalid employee name
    When user enters invalid employee name
      | empName       |
      | invalid1 name |
      | invalid2 emp  |
      | invalid3@     |
