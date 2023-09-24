package swagLabs.testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SwagLabs.base.TestBase;
import com.SwagLabs.util.Log;
import com.SwagLabs.util.TestUtil;

import swagLabs.pages.LoginPageData;

public class LoginPageDataTest extends TestBase {
	
	
	
	LoginPageData loginPageData;
	//HomePage homePage;
	TestUtil testUtil;
	static //ContactsPage contactsPage;
	
	String sheetName = "Login";
	
	   
	public LoginPageDataTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");
		
		Log.info("****************************** Starting test cases execution  *****************************************");
		
		initialization();
		testUtil = new TestUtil();
		loginPageData = new LoginPageData();

}
	@DataProvider
	public static Object[][] getLoginData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getLoginData")
	public void validateLoginCredentials(String UserName, String PassWord) {
		
		Log.info("****************************** starting test case *****************************************");
		Log.info("****************************** loginDataTest *****************************************");
		
		//homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		
		loginPageData.LoginCredentialsTest(UserName, PassWord);
		
//		boolean flag = loginPageData.validateManagerIDMessage();
//            	Assert.assertTrue(flag);
		 boolean title = loginPageData.validateManagerIDMessage();
		Assert.assertEquals(title,"Guru99 Bank Manager HomePage");
	}
	
		
//		@Test
//		public void validateLoginCredentials2(){
//		loginPageData.LoginCredentialsTest(prop.getProperty("username"), prop.getProperty("password"));
//		}
//		 
//		 
//		 
//		 Log.info("****************************** Verifying Manager Page Title *****************************************");
//		 
//		 	 String title = loginPageData.validateManagePageTitle();
//			Assert.assertEquals(title,"Guru99 Bank Manager HomePage");

		//(priority=1, dataProvider="getCRMTestData")
		//String title, String firstName, String lastName, String company
		//Thread.sleep(10);
//		boolean flag = loginPageData.validateAccountLogoImage();
//	Assert.assertTrue(flag);

	
	
	
//@Test(priority=2)
//public void validateAccountLogoImageTest(){
//	Log.info("****************************** starting test case *****************************************");
//	Log.info("****************************** AccountLogoImageTest *****************************************");
//	boolean flag = loginPageData.validateAccountLogoImage();
//	Assert.assertTrue(flag);
//}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
