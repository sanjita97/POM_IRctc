package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Accomodationpage;
import pom.irctc.pages.FTRSignupPage;
import pom.irctc.pages.Homepage;
import pom.irctc.pages.UserRegistration;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify book your coach in irctc application. ";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test

	public void  bookyourcoach() {
		
		new Homepage()
		.mouseoveronHoliday()
		.mouseoveronSlays()
		.clickonLounge()
		.switchToNextWindow()
		.clickonMenuIcon()
		.clickonBookYourCoachorTrain()
		.switchToNextWindow()
		.clickOnNewUserSignUp()
		.enterUserid("sanjita1997")
		.enterPassword("Sanjita9197")
		.enterConfirmPassword("Sanjita9197")
		.selectSecurityQuestion("What was the name of your first school?")
		.enterSecurityAnswer("HMSS")
		.clickDateOfBirth()
		.selectMonth("Mar")
		.selectYear("1997")
		.clickOnDay("8")
		.chooseGender("Female")
		.chooseMaritalStatus("UnMarried")
		.enterEmail("sanjitasilpa1997@gmail.com")
		.selectOccupation("Student")
		.enterFirstName("sanjita")
		.enterMiddleName("sane")
		.enterLastName("saravanan")
		.webPageScrollDown()
		.selectNationality("Indian")
		.enterFlatNo("226/D Valakomabai Pirivu Road,")
		.enterStreetName("Karumaivattam")
		.enterAreaOrLocatity("thammampatty")
		.selectCountry("India")
		.enterMobileNo("9443514720")
		.enterPinCode("636001")
		.webPageScrollDown()
		.enterCity("Salem")
		.enterState("TAMIL NADU")
		.enterPostOffice("Salem H.O")
		.clickOnResidencetoofficeAddressNo()
		.enterFlatNoOffice("1/22")
		.enterStreetOfficeNo("greengarden")
		.enterAreaOfficeNo("near jk street")
		.enterCountryOffice("India")
		.enterMobileOfficeNo("7698453210")
		.enterPinCodeOfficeNo("636002")
		.enterCityOffice("Salem")
		.enterStateOffice("TAMIL NADU")
		.enterPostOfficeNo("Arisipalayam S.O");		
			
		
	}

}
