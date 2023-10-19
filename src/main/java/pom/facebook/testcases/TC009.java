package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.Homepages;
import pom.facebook.pages.Signuppage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify new user sign up for facebook application.";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https:www.facebook.com";
		
	}
    @Test
	public void  facebooksingup() {
		
		
		new Homepages()
		.clickOnCreateNewAccount()
        .enterFirstName("Sanjita")		
		.enterSurName("saravanan")
		.enterEmailAddress("sanjitasilpa1997@gmail.com")
		.enterConfirmEmailAddress("sanjitasilpa1997@gmail.com")
		.enterPassword("sanjita1997")
		.selectDay("8")
		.selectMonth("Mar")
		.selectYear("1997")
		.clickOnGender("Female");		
	
		
		
	}
	
	
}
