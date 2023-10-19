package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.Alertspage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To verify, the frame has been switched to another frame in a confirm alert application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		
	}
	@Test

public void Confirmalert() {
	
		new Alertspage()
		.switchToFrame("iframeResult")
		.clickOnTryItbutton()
		.getAlertTextandPrintinConsole()
		.accpetTheAlert()
		.verifyGivenData("You pressed OK!")
		.refreshCurrentPage()
		.switchToFrame("iframeResult")
		.clickOnTryItbutton()
		.getAlertTextandPrintinConsole()
		.dismissTheAlert()
		.verifyGivenData("You pressed Cancel!")
		.switchToFrameOut()
		.clickonHomebutton();
		
	}
	
	
	
}
