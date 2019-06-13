package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.srssprojects.cucumber_bank.AdminHomePage;
import in.srssprojects.cucumber_bank.BankHomePage;
import utilitiles.Browser;
import utilitiles.BrowserHelper;

public class LoginSteps extends BrowserHelper {
	BankHomePage bankHomePage;
	AdminHomePage adminHomePage;
	
	@Given("user is in bank home")
	public void user_is_in_bank_home() throws Throwable {
		openBrowser(Browser.CHROME, "http://srssprojects.in");
		bankHomePage = new BankHomePage(driver);
	}

	@When("user enters valid username")
	public void user_enters_valid_username() throws Throwable {
		bankHomePage.fillUserName("Admin");
	}

	@Then("user can see welcome to admin message with logout link")
	public void user_can_see_welcome_to_admin_message_with_logout_link() throws Throwable {
		sleep(2000);
		Assert.assertTrue(adminHomePage.verifyAdminHomePage());
	}

	@And("user enter valid password")
	public void user_enter_valid_password() throws Throwable {
		bankHomePage.fillPassword("Admin");
		
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws Throwable {
		bankHomePage.clickLogin();
		adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		
	}
}
