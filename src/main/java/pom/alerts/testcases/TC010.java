package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.Alertspage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify, the frame has been switched to another frame in a simple alert application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	@Test

	public void Simplealerts() {
		
	new Alertspage()
	.switchToFrame("iframeResult")
	.clickOnTryItbutton()
	.getAlertTextandPrintinConsole()
	.accpetTheAlert()
	.switchToFrameOut()
	.clickonHomebutton();
	
		
	}
	
	
	
	
	
	
	
}
