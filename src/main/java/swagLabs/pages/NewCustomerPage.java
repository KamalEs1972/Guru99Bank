package swagLabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SwagLabs.base.Elements;
import com.SwagLabs.base.TestBase;

public class NewCustomerPage extends TestBase {
	
	@FindBy(xpath="//p[@class='heading3']")
	static WebElement addNewCostumerMessage;
	
	@FindBy(xpath="//input[@name='name']")
	static WebElement	customerNameField;
	
	@FindBy(xpath="//input[@name='rad1'][1]")
	static WebElement	genderrRadioButtonMale;
	
	@FindBy(xpath="//input[@name='rad1'][2]")
	static WebElement	genderrRadioButtonFemale;
	
	@FindBy(xpath="//input[@name='dob']")
	static WebElement	dateOfBirthField;
	
	@FindBy(xpath="//textarea[@name='addr']")
	static WebElement	addressfield;
	
	@FindBy(xpath="//input[@name='city']")
	static WebElement	cityField;
	
	@FindBy(xpath="//input[@name='state']")
	static WebElement	stateField;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	static WebElement	mobileNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	static WebElement email1;
	
	@FindBy(xpath="//input[@name='password']")
	static WebElement	password1;
	
	@FindBy(xpath="//input[@name='pinno']")
	static WebElement pinField	;
	
	@FindBy(xpath="//input[@name='sub']")
	static WebElement submitButton;
	
	@FindBy(xpath="//*[@id=\"customer\"]/tbody/tr[1]/td/p")
	static WebElement registeredSuccessMessage;
	
	
	
	
	
		
	
	
	
	@FindBy(linkText="New Customer")
	static WebElement	managerIDMessage;
	
	
	//Initializing the Page Objects:
	public NewCustomerPage(){
		PageFactory.initElements(driver, this);
	}
	
		
		public boolean verifyAddNewCostumerMessage(){
			return addNewCostumerMessage.isDisplayed();
		}
		
		public void addNewCutomer(String fullName,String dateOfBirth,String address,String city,String state, String pin,String mobilNumber,String email,String password) {
			
			Elements.TypeText(customerNameField, fullName);
			Elements.selectRadioButton(genderrRadioButtonFemale);
			Elements.TypeText(dateOfBirthField, dateOfBirth);
			Elements.TypeText(pinField, pin);
			Elements.TypeText(addressfield, address);
			Elements.TypeText(cityField, city);
			Elements.TypeText(stateField, state);
			Elements.TypeText(pinField, pin);
			Elements.TypeText(mobileNumber, mobilNumber);
			Elements.TypeTextIfElementPresent(email1, email);
			Elements.TypeText(password1, password);
			submitButton.click();
			
			   
					
		}
		
		public void validateRegisterSuccessMessage(){
		//	return registeredSuccessMessage.isDisplayed();
			  Assert.assertTrue(Elements.VerifyTextEquals(registeredSuccessMessage,"Customer Registered Successfully!!!"));
		}
		
	}

