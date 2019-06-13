Feature: login test
Description: As a admin I want to do login so that I can see Welcome Admin message
with logout link

Scenario: Login with valid credentials
Given user is in bank home
When user enters valid username
And user enter valid password
And user clicks on login button
Then user can see welcome to admin message with logout link
