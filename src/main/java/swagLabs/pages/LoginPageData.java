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
	
	@FindBy(css="tr[class='heading3'] td")
	static WebElement	managerIDMessage;
	
	@FindBy(css="img[src='../images/1.gif']")
	
	static WebElement	Image1;
	
@FindBy(css="#gdpr-consent-notice")
	
	static WebElement	iframe;
	
@FindBy(css="#save")
	
	static WebElement allCoockies	;
	
	
	
	
	//Initializing the Page Objects:
	public LoginPageData(){
		PageFactory.initElements(driver, this);
	}
	public void LoginCredentialsTest(String userName, String passWord) {
				
		userNameField.sendKeys(userName);
		passwordField.sendKeys(passWord);
		loginButton.click();
		
		

		//Switch to the frame
		driver.switchTo().frame(iframe);

		//Now we can click the button
		
		allCoockies.click();
		
			//	return new AccountPage1();
}
	public boolean validateManagerIDMessage(){
		return managerIDMessage.isDisplayed();
	}
	
	public boolean validateImage1(){
		return Image1.isDisplayed();
	}
	
	public String validateManagePageTitle(){
		return driver.getTitle();
						
	}
//	public boolean validateAccountLogoImage(){
//		return accountLogoImage.isDisplayed();
//	}
	}
