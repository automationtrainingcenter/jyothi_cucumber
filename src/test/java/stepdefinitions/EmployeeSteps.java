package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.srssprojects.cucumber_bank.AdminHomePage;
import in.srssprojects.cucumber_bank.EmployeeCreationpage;
import in.srssprojects.cucumber_bank.EmployeeDetailspage;
import io.cucumber.datatable.DataTable;
import utilitiles.BrowserHelper;

public class EmployeeSteps extends BrowserHelper{
	EmployeeCreationpage empCreationPage;
	
	@Given("user clicks on employee button")
	public void user_clicks_on_employee_button() {
	    AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
	    adminHomePage.clickEmployees();
	}

	@Given("user clicks on new employee button")
	public void user_clicks_on_new_employee_button() {
	    EmployeeDetailspage empDetailsPage = PageFactory.initElements(driver, EmployeeDetailspage.class);
	    empDetailsPage.clickNewEmployee();
	    empCreationPage = PageFactory.initElements(driver, EmployeeCreationpage.class);
	}

	@When("user enters employee name {string}")
	public void user_enters_employee_name(String string) {
		empCreationPage.fillEmployerName(string);
	   
	}

	@When("user enters login password {string}")
	public void user_enters_login_password(String string) {
	    empCreationPage.fillLoginpassword(string);
	}

	@When("user selects role name {string}")
	public void user_selects_role_name(String string) {
	    empCreationPage.selectRoleType(string);
	}

	@When("user selects role type {string}")
	public void user_selects_role_type(String string) {
	    empCreationPage.selectBranchType(string);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    empCreationPage.clickSubmit();
	}

	@Then("user can see a message as Employee created successfully with some id")
	public void user_can_see_a_message_as_Employee_created_successfully_with_some_id() {
	    String text = driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    Assert.assertTrue(text.contains("New Employer Created"));
	}
	
	@When("user enters invalid employee name")
	public void user_enters_invalid_employee_name(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> rows = dataTable.asMaps();
		for(Map<String, String> row : rows) {
			empCreationPage.fillEmployerName(row.get("empName"));
			String text = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			Assert.assertTrue(text.contains("only alphabets and numeric"));
		}
	}

}
