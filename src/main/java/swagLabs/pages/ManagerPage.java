package swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.base.TestBase;

public class ManagerPage extends TestBase {
	
//	@FindBy(xpath="//input[@name='uid']")
//	static WebElement newCustomerLink;
	
//	@FindBy(xpath="//input[@name='password']")
//	static WebElement	passwordField;
//	
//	@FindBy(xpath="//input[@name='btnLogin']")
//	static WebElement	loginButton;
	
	@FindBy(linkText="New Customer")
	static WebElement newCustomerLink;
	
	
	//Initializing the Page Objects:
	public ManagerPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void newCostomerLink () {
		
		newCustomerLink.click();	
	}

}
