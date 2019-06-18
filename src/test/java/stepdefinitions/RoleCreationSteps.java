package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.srssprojects.cucumber_bank.AdminHomePage;
import in.srssprojects.cucumber_bank.BankHomePage;
import in.srssprojects.cucumber_bank.RoleCreationPage;
import in.srssprojects.cucumber_bank.RoleDetailsPage;

import utilitiles.BrowserHelper;

public class RoleCreationSteps extends BrowserHelper {
	BankHomePage bankHomePage;
	AdminHomePage adminHomePage;
	RoleCreationPage roleCreationPage;

	@Given("user do login with valid credentials")
	public void user_do_login_with_valid_credentials() {
		bankHomePage = new BankHomePage(driver);
		bankHomePage.fillUserName("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLogin();

	}

	@Given("user clicks on role button")
	public void user_clicks_on_role_button() {
		adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		adminHomePage.clickRoles();
	}

	@Given("user clicks on new role button")
	public void user_clicks_on_new_role_button() {
		RoleDetailsPage roleDetailsPage = PageFactory.initElements(driver, RoleDetailsPage.class);
		roleDetailsPage.clickNewRole();
		roleCreationPage = PageFactory.initElements(driver, RoleCreationPage.class);
	}

	@When("user enters role name as {string}")
	public void user_enters_role_name_as(String string) {
		roleCreationPage.fillRoleName(string);
	}

	@When("user enters role description as {string}")
	public void user_enters_role_description_as(String string) {
		roleCreationPage.fillRoleDescription(string);
	}

	@When("user selects role type as {string}")
	public void user_selects_role_type_as(String string) {
		roleCreationPage.selectRoleType(string);
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		roleCreationPage.clickSubmit();
	}

	@Then("user can see a message saying role created successfully with some id")
	public void user_can_see_a_message_saying_role_created_successfully_with_some_id() {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertTrue(text.contains("New Role"));
	}

	@Then("user can see an error message saying invalid role name")
	public void user_can_see_an_error_message_saying_invalid_role_name() {
		String text = driver.switchTo().alert().getText();
		sleep(3000);
		driver.switchTo().alert().accept();
		Assert.assertTrue(text.contains("This field accepts alphabets only"));
	}
	
	@Then("user can see an error message please Fill the following fields --Role Name")
	public void user_can_see_an_error_message_please_Fill_the_following_fields_Role_Name() {
		String text = driver.switchTo().alert().getText();
		sleep(3000);
		driver.switchTo().alert().accept();
		Assert.assertTrue(text.contains("Please fill in the"));
   
	}

}
