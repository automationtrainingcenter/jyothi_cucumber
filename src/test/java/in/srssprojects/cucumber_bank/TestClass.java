package in.srssprojects.cucumber_bank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
	
	private WebDriver driver;
	BankHomePage bankHomePage;
	AdminHomePage adminHomePage;
	RoleDetailsPage roleDetailsPage;
	RoleCreationPage roleCreationPage;
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://srssprojects.in");
		driver.manage().window().maximize();
		bankHomePage = new BankHomePage(driver);
	}
	
	
	public void login() {
		bankHomePage.fillUserName("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLogin();
		adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		
	}
	
	public void roleCreation() {
		roleDetailsPage = adminHomePage.clickRoles();
		roleCreationPage = roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleName("anyRole");
		roleCreationPage.fillRoleDescription("description");
		roleCreationPage.selectRoleType("E");
		Alert alert = roleCreationPage.clickSubmit();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.launch();
		tc.login();
		tc.roleCreation();
	}

}
