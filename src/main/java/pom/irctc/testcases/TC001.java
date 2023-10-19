package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Homepage;
import pom.irctc.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify new user registration for irctc application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in";
		
	}
	@Test

	
	public void irctcregistration() {
		
		new Homepage()
		.clickonRegister()
		.entertheUserName("Sanjita1232")
		.enterthePassword("Sanjitasilpa1997")
		.enterConfirmPassword("Sanjitasilpa1997")
		.selectPreferredLanguage("English")
		.selectSecurityQuestion("What is your pet name?")
		.enterSecurityAnswer("Raja")
		.clickonContinue()
		.enterFirstName("sanjita")
		.enterMiddleName("sane")
		.enterlastName("saravanan")
		.selectOccupation("STUDENT")
		.selectMartialStatus("Unmarried")
		.chooseGender("Female")
		.enterMobileNumber("9874563512")
		.clickXpathofDateofBirth()
		.selectMonth("March")
		.selectYear("1997")
		.clickonDay("8")
		.selectCountry("India")
		.enterEmailId("sanjitasilpa1997@gmail.com")
		.selectNationality("India")
		.clickonContinue()
		.enterBlockNo("2/9, McNichols Rd,")
		.enterStreetname("3rd Lane Rossmary")
		.enterAreaName("MS Thottam")
		.enterPincode("636001")
		.enterStatename("TAMIL NADU")
		.selectCity("Salem")
		.selectPostOffice("Devendrapuram S.O")
		.enterPhoneNo("8974563211")
		.clickOnResidenceOfficeAddressasNo()
		.enterFlatNo("3/9 B")
		.enterLanename("greenland")
		.enterLocalityName("near kn street")
		.selectOfficeCountry("India")
		.enterOfficePincode("636004")
		.enterOfficeStatename("TAMIL NADU")
		.enterOfficeCity("Salem")
		.enterOfficePostOffice("Alagapuram S.O")
		.enterOfficePhoneNo("8794561230")
		.clickonTermsandCondition();		
		
	}
	
	
}
