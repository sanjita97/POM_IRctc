package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.Alertspage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify, the frame has been switched to another frame in a prompt alert ";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	@Test


	public void Promptalert() {
		
		new Alertspage()
		.switchToFrame("iframeResult")
        .clickOnTryItbutton()
		.sendTheData("Sanjita")		
		.getAlertTextandPrintinConsole()
		.accpetTheAlert()
		.getDataPresentInText()
		.verifyGivenData(Alertspage.name)
		.refreshCurrentPage()
		.switchToFrame("iframeResult")
		.clickOnTryItbutton()
		.sendTheData("Anitha")
		.getAlertTextandPrintinConsole()
		.dismissTheAlert()
		.getDataIsNotPresentedInText()
		.verifyGivenDataIsNotPrinted(Alertspage.error)
		.switchToFrameOut()
		.clickonHomebutton();

		
	}
	
	
	
	
}
