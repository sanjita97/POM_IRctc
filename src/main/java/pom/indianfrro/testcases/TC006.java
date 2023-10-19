package pom.indianfrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.user.reg.pages.AccomodationRegPages;
import pom.indianfrro.user.reg.pages.MenuUserRegistrationPages;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify new user registration for indianfrro application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
	@Test
	public void indianfrroRegistration() {
		
		new MenuUserRegistrationPages()
		.clickOnSingUpReg()
		.enterUserID("sanjita123")
		.enterPassword("sanjita1997")
		.enterConfirmPassword("sanjita1997")
		.selectQuestion("What is the name of your favorite book?")
		.enterYourAnswer("harry potter")
		.enterName("sanjita")
		.selectGender("Female")
		.enterDateOfBirth("08/03/1997")
		.enterDesignation("delhi")
		.enterEmailID("sanjitasilpa1997@gmail.com")
		.enterMobileNo("7373514137")
		.enterPhoneNo("7373517894")
		.selectNationality("INDIA")
		.enterHotelorHouseDetailName("sanjita")
		.enterCapacity("5")
		.enterAddress("No.2, McNichols Rd,3rd Lane Rossmary,")
		.selectState("TAMIL NADU")
		.selectCity("SALEM")
		.selectFRRODescription("FRO SALEM URBAN")
		.selectAccomodationType("Hotel")
		.selectAccomodationGrade("Four Star")
		.enterHotelEmailID("sanjitasilpa1997@gmail.com")
		.enterMoblieDetails("894561373")
		.enterPhoneDetails("987456325")
		.enterOwnerDetailsName("Ramya")
		.enterOwnerAddress("No.3, McNichols St,5th Lane Greenland")
		.selectOwnerState("TAMIL NADU")
		.selectOwnerCity("SALEM")
		.enterOwnerEmailID("ramyajhony967@gmail.com")
		.enterOwnerPhoneNo("9443698710")
		.enterOwnerMobileNo("7895463210")
		.clickAddButton()
		.enterOwnerDetailsName("Vinitha")
		.enterOwnerAddress("No.7, Mchols St.Lane Greenland")
		.selectOwnerState("TAMIL NADU")
		.selectOwnerCity("SALEM")
		.enterOwnerEmailID("vinithajhony967@gmail.com")
		.enterOwnerPhoneNo("845697123")
		.enterOwnerMobileNo("7895463210")
		.clickAddButton()
		.enterOwnerDetailsName("Anitha")
		.enterOwnerAddress("No.3,green richard st.")
		.selectOwnerState("TAMIL NADU")
		.selectOwnerCity("SALEM")
		.enterOwnerEmailID("rosyjhony967@gmail.com")
		.enterOwnerPhoneNo("9443698710")
		.enterOwnerMobileNo("7895463210");		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
