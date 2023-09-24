package swagLabs.testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SwagLabs.base.TestBase;
import com.SwagLabs.util.Log;
import com.SwagLabs.util.TestUtil;

import swagLabs.pages.LoginPageData;
import swagLabs.pages.ManagerPage;
import swagLabs.pages.NewCustomerPage;

public class NewCostomerLinkTest extends TestBase {
	LoginPageData loginPageData;
	ManagerPage managerPage;
	NewCustomerPage newCustomerPage;
	TestUtil testUtil;
	//HomePage homePage;
	//TestUtil testUtil;
	//ContactsPage contactsPage;
	
//	String sheetName = "Login";
	
	   
	public NewCostomerLinkTest(){
			super();
			
	}
	
	
	
	
	@BeforeMethod
	public void setUp()  {
		DOMConfigurator.configure("log4j.xml");
		
		Log.info("****************************** Starting test cases execution  *****************************************");
		
		initialization();
		testUtil = new TestUtil();
		loginPageData = new LoginPageData();
		managerPage = new ManagerPage () ;
		 newCustomerPage = new NewCustomerPage();

}
	@Test (dataProvider="getLoginData",dataProviderClass=LoginPageDataTest.class)
	public void VerifyNewCostmerlink (String UserName, String PassWord) throws InterruptedException {
		//loginPageData = new LoginPageData();
		 
	//	 newCustomerPage = new NewCustomerPage();
				//loginPageData.getLoginData();
			// loginPageData.LoginCredentialsTest(prop.getProperty("username"), prop.getProperty("password"));
		loginPageData.LoginCredentialsTest(UserName, PassWord);
		 managerPage.newCostomerLink();
		
		  newCustomerPage.verifyAddNewCostumerMessage();
		
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
