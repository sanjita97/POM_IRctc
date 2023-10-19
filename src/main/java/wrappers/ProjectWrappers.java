package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers{
	
	public String browser;
	public String url;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	@BeforeTest
	public void beforeTest() {
		loadobject();
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		invokeApp(browser, url);

	}
	@AfterMethod
	public void aftherMethod() {
		closeAllBrowsers();
		
	}
	@AfterClass
	public void aftherClass(){
		endTest();
		
	}
	@AfterTest
	public void aftherTest() {
		unloadobject();
		
	}
	@AfterSuite
	public void aftherSuite() {
		
	endReport();
	}
	
	
	

}
