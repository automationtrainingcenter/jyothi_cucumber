$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "login test",
  "description": "  Description: As a admin I want to do login so that I can see Welcome Admin message\n  with logout link",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_in_bank_home()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@invalid_username"
    }
  ]
});
formatter.step({
  "name": "user enters invalid username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enters_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see an error message saying invalid banker name or password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_can_see_an_error_message_saying_invalid_banker_name_or_password()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/roleCreation.feature");
formatter.feature({
  "name": "role creation",
  "description": "  Description: As a admin I want to create role with valid and invalid data so that\n  I can see role created successfully message or error messages for invalid data",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@role"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_in_bank_home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on role button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_clicks_on_role_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new role button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationSteps.user_clicks_on_new_role_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Role ceation with invalid rolename",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@role"
    },
    {
      "name": "@invalid_rolename"
    }
  ]
});
formatter.step({
  "name": "user enters role name as \"invlaid role Name\"",
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationSteps.user_enters_role_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see an error message saying invalid role name",
  "keyword": "Then "
});
formatter.match({
  "location": "RoleCreationSteps.user_can_see_an_error_message_saying_invalid_role_name()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});