package swagLabs.testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SwagLabs.base.TestBase;
import com.SwagLabs.util.Log;
import com.SwagLabs.util.TestUtil;
import com.SwagLabs.util.Utilities;

import swagLabs.pages.LoginPageData;
import swagLabs.pages.ManagerPage;
import swagLabs.pages.NewCustomerPage;

		public class VerifyAddNewCustomer extends TestBase {
	
	LoginPageData loginPageData;
	ManagerPage managerPage;
	NewCustomerPage newCustomerPage;
	TestUtil testUtil;
	
		public VerifyAddNewCustomer () {
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
		
//		@Test (dataProvider="getLoginData",dataProviderClass=LoginPageDataTest.class)
//		public void VerifyNewCostmerlink (String UserName, String PassWord) throws InterruptedException {
//			//loginPageData = new LoginPageData();
//			 
//		//	 newCustomerPage = new NewCustomerPage();
//					//loginPageData.getLoginData();
//				// loginPageData.LoginCredentialsTest(prop.getProperty("username"), prop.getProperty("password"));
//			loginPageData.LoginCredentialsTest(UserName, PassWord);
//			managerPage.newCostomerLink();
//		//	newCustomerPage.addNewCutomer(prop.getProperty("fullName"),prop.getProperty("address"),prop.getProperty("city"),prop.getProperty("state"),prop.getProperty("pin"),prop.getProperty("mobilNumber"),prop.getProperty("email"),prop.getProperty("password"));
//			 newCustomerPage.addNewCutomer(prop.getProperty("CustomerName"),prop.getProperty("DateOfBirth"),prop.getProperty("Address"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("PIN"),prop.getProperty("MobileNumber"),prop.getProperty("Email"),prop.getProperty("Password2"));	
//		}
			
		@Test (dataProvider="getLoginData",dataProviderClass=LoginPageDataTest.class)
		public void addNewCustomerTest (String UserName, String PassWord) throws InterruptedException {
		
			loginPageData.LoginCredentialsTest(UserName, PassWord);
			managerPage.newCostomerLink();
		//	newCustomerPage.addNewCutomer(prop.getProperty("fullName"),prop.getProperty("address"),prop.getProperty("city"),prop.getProperty("state"),prop.getProperty("pin"),prop.getProperty("mobilNumber"),prop.getProperty("email"),prop.getProperty("password"));
			 newCustomerPage.addNewCutomer(prop.getProperty("CustomerName"),prop.getProperty("DateOfBirth"),prop.getProperty("Address"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("PIN"),prop.getProperty("MobileNumber"),System.currentTimeMillis()+ prop.getProperty("Email"),prop.getProperty("Password2"));
			 newCustomerPage.validateRegisterSuccessMessage();
			 
		}
			
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
//	}
//		@Test(dataProvider="getLoginData",dataProviderClass=LoginPageDataTest.class)
//		public void addNewCustomerTest (String userName, String passWord, String fullName,String address,String city,String state, String pin,String mobilNumber,String email,String password) throws InterruptedException  {
//			loginPageData.LoginCredentialsTest(userName, passWord);
//			managerPage.newCostomerLink();
//		//	loginPageData.LoginCredentialsTest(prop.getProperty("username"), prop.getProperty("password"));
//		//	 managerPage.newCostomerLink();
//			 //newCustomerPage.verifyAddNewCostumerMessage();
//		//	 newCustomerPage.addNewCutomer(prop.getProperty("CustomerName"),prop.getProperty("Address"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("PIN"),prop.getProperty("MobileNumber"),prop.getProperty("Email"),prop.getProperty("Password2"));
//	
//}

}
}