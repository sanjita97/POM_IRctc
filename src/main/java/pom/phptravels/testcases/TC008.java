package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.reg.pages.PHPRegisterpages;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify new user registration for phptravels application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.phptravels.org/register.php";
		
	}
	@Test
	public void phpregistration() {
		
		new PHPRegisterpages()
		.enterFirstName("sanjita")
		.enterLastName("saravanan")
		.enterEmailID("sanjitasilpa1997@gmail.com")
		.enterPhoneNumber("+91 9443514720")
		.enterCompanyName("sanjita & co.")
		.enterStreetAddress1("No.2, McNichols Rd,")
		.enterAddress2("3rd Lane Rossmary,")
		.enterCityName("salem")
		.enterStateName("tamilnadu")
		.enterPostCode("636001")
		.selectCountry("India")
		.enterMobileNo("9443514720")
		.enterPassword("sanjita@1997")
		.enterConfirmPassword("sanjita@1997");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
