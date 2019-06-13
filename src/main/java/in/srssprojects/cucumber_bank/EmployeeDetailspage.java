package in.srssprojects.cucumber_bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDetailspage {
	
WebDriver driver;
	
	@FindBy(id = "BtnNew")
	private WebElement newEmployee;
	
	public EmployeeDetailspage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public EmployeeCreationpage clickNewEmployee() 
	{
		this.newEmployee.click();
		return PageFactory.initElements(driver, EmployeeCreationpage.class);

	}
	
}


