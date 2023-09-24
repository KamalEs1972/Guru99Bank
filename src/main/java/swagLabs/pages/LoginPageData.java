package swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.base.TestBase;



public class LoginPageData extends TestBase {
	
	@FindBy(xpath="//input[@name='uid']")
	static WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement	passwordField;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	static WebElement	loginButton;
	
	@FindBy(xpath="//td[normalize-space()='Manger Id : mngr528039']")
	static WebElement	managerIDMessage;
	
	
	//Initializing the Page Objects:
	public LoginPageData(){
		PageFactory.initElements(driver, this);
	}
	public void LoginCredentialsTest(String userName, String passWord) {
				
		userNameField.sendKeys(userName);
		passwordField.sendKeys(passWord);
		loginButton.click();
		
			//	return new AccountPage1();
}
	public boolean validateManagerIDMessage(){
		return managerIDMessage.isDisplayed();
	}
//	public String validateManagePageTitle(){
//		return driver.getTitle();
//				
//	}
//	public boolean validateAccountLogoImage(){
//		return accountLogoImage.isDisplayed();
//	}
	
}