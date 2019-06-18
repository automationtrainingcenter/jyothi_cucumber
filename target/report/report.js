$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/branchCreation.feature");
formatter.feature({
  "name": "branch creation",
  "description": "  Description: As a admin I want to test branch reset with multiple sets of data\n  so that I can see an empty branch creation form",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "user clicks on branch button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreaitonSteps.user_clicks_on_branch_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new branch button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreaitonSteps.user_clicks_on_new_branch_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify branch creation reset with multiple sets of data from json file",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on reset button after filling branch creation form using json data",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreaitonSteps.user_clicks_on_reset_button_after_filling_branch_creation_form_using_json_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see an empty form",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchCreaitonSteps.user_can_see_an_empty_form()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepdefinitions.BranchCreaitonSteps.user_can_see_an_empty_form(BranchCreaitonSteps.java:65)\r\n\tat ✽.user can see an empty form(file:src/test/java/features/branchCreation.feature:13)\r\n",
  "status": "pending"
});
});