package stepdefinitions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import org.openqa.selenium.support.PageFactory;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.hu.Amennyiben;
import in.srssprojects.cucumber_bank.AdminHomePage;
import in.srssprojects.cucumber_bank.BranchBean;
import in.srssprojects.cucumber_bank.BranchCreationpage;
import in.srssprojects.cucumber_bank.BranchDetailspage;
import utilitiles.BrowserHelper;

public class BranchCreaitonSteps extends BrowserHelper{
	private BranchCreationpage branchCreationPage;

	@Given("user clicks on branch button")
	public void user_clicks_on_branch_button() {
	    AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
	    adminHomePage.clickBranches();
	}

	@Given("user clicks on new branch button")
	public void user_clicks_on_new_branch_button() {
		BranchDetailspage branchDetailsPage = PageFactory.initElements(driver, BranchDetailspage.class);
		branchDetailsPage.clickNewbranch();
		branchCreationPage = PageFactory.initElements(driver, BranchCreationpage.class);
	}

	@When("user clicks on reset button after filling branch creation form using json data")
	public void user_clicks_on_reset_button_after_filling_branch_creation_form_using_json_data() {
		try {
			Gson gson = new Gson();
			FileInputStream fis = new FileInputStream(".\\resources\\branchData.json");
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			BranchBean[] branches = gson.fromJson(reader, BranchBean[].class);
			for(BranchBean branch : branches) {
				branchCreationPage.fillbranchName(branch.getBranchName());
				branchCreationPage.fillAdress1(branch.getAddress1());
				branchCreationPage.fillZipcode(branch.getZipcode());
				branchCreationPage.selectcountry(branch.getCountry());
				branchCreationPage.selectstate(branch.getState());
				branchCreationPage.selectcity(branch.getCity());
				branchCreationPage.clickReset();
				sleep(3000);
			}
		} catch (Exception e) {
			
		}
	}

	@Then("user can see an empty form")
	public void user_can_see_an_empty_form() {
	   
	}
}
