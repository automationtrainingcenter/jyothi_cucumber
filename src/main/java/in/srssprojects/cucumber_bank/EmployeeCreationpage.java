package in.srssprojects.cucumber_bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreationpage {
	
	WebDriver driver;

	
	@FindBy(id = "txtUname")
	private WebElement EmployerName;

	
	@FindBy(id = "txtLpwd")
	private WebElement LoginPassword;
	
	@FindBy(id = "lst_Roles")
	private WebElement roleType;
	
	@FindBy(id = "lst_Branch")
	private WebElement branchType;


	
	@FindBy(id = "BtnSubmit")
	private WebElement submit;

	// reset
	@FindBy(id = "Btn_Reset")
	private WebElement reset;

	// cancel
	@FindBy(id = "Btn_cancel")
	private WebElement cancel;

	public EmployeeCreationpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillEmployerName(String employerName) {
		this.EmployerName.sendKeys(employerName);
	}
	
	public void fillLoginpassword(String loginpassword) {
		this.LoginPassword.sendKeys(loginpassword);
	}

	public void selectRoleType(String roleType) {
		new Select(this.roleType).selectByVisibleText(roleType);
	}
	
	public void selectBranchType(String branchType) {
		new Select(this.branchType).selectByVisibleText(branchType);
	}

	public Alert clickSubmit() {
		this.submit.click();
		return driver.switchTo().alert();
	}

	public void clickReset() {
		this.reset.click();
	}

	public void clickCancel() {
		this.cancel.click();
	}

}



