package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Accomodationpage;
import pom.irctc.pages.Charterpage;
import pom.irctc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify  Saloon Mandatory Check in irctc application. ";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test

	public void irctccharter() {
		
		new Homepage()
		.mouseoveronHoliday()
		.mouseoveronSlays()
		.clickonLounge()
		.switchToNextWindow()
		.clickonMenuIcon()
		.clickOnCharter()
		.clickonDismissMenuIcon()
		.clickOnEnquiryForm()
		.enterNameofApplicant("sanjita")
		.enterNameofOrganisation("world health org")
		.enterAddress("No.7 BG colony,Greenland,salem,Tamilnadu")
		.enterMobileNumber("78945612")
		.enterEmailId("sanjitasilpa1997@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation("Salem")
		.enterDestinationStation("Delhi")
		.clickCheckInDate()
		.clickOnDateOfDeparture("26")
		.clickCheckOutDate()
		.clickOnDateOfArrival("29")
		.enterDurationOfTour("3 days")
		.enterNumberAndTypeOfCoaches("d2 sleeper coach")
		.enterNoOfPassengers("3")
		.enterPurposeOfCharter("business trip")
		.enterAdditionalServicesRequired("catering and free wifi")
		.clickonSubmitButton()
		.verifyGivenMobileNo("Mobile no. not valid");
		
	}
	
	
	
		
}
