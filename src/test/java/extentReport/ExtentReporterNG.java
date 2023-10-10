package extentReport;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG  {
	
	
	public static ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Kamal Essalhi");
		 extent.setSystemInfo("Project Name ", "Guru99 App");
		 extent.setSystemInfo("Os", "Win10");
		 extent.setSystemInfo("Browser", "Chrome");
				return extent;
		
		
		
	}
}
		
		
		
	


