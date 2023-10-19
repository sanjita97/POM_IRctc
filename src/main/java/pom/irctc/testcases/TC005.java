package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Accomodationpage;
import pom.irctc.pages.GuestLoginPage;
import pom.irctc.pages.Homepage;
import pom.irctc.pages.HotelDetailPage;
import pom.irctc.pages.HotelPage;
import pom.irctc.pages.PassengerDetailPage;
import pom.irctc.pages.SearchHotelPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify book hotels with GST in irctc application. ";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test


	
	public void bookhotelgstYes() {
		
		new Homepage()
		.mouseoveronHoliday()
		.mouseoveronSlays()
		.clickonLounge()
		.switchToNextWindow()
		.clickOnIrctcHoletsIcon()
		.switchToNextWindow()
		.clickonLogin()
		.clickonGuestUserLogin()
		.enterEmail("sanjitasilpa1997@gmail.com")
		.enterMobileNo("7373514137")
		.clickOnLoginButton()
		.enterDestination("coimbatore")
		.selectDestination()
		.selectCheckInDate("25")
		.selectCheckOutDate("26")
		.selectRoom("1")
		.selectAdultsNo("3")
		.clickOnDoneButton()
		.clickOnFindHotel()
		.clickOnfirstdisplayedHotel()
		.switchToNextWindow()
		.getHotelNameandPrintinConsole()
		.getPriceandPrintinConsole()
		.clickonContinuetoBook()
		.selectTitle("Miss")
		.enterFirstName("Sanjita")
		.enterLastname("Saravanan")
		.selectCountry("India")
		.selectState("TAMIL NADU")
		.selectGSTYesOrNo("Yes")
		.enterGstNo("4569871")
		.enterCompanyName("srs textiles")
		.enterCompanyAddress("No.2 greenland,fairstreet,salem")
		.clickonContinue()
		.verifyERROPleaseEnterValidGSTNumber("Please Enter Valid GSt number");		
		
		
		
		
		
		
		
		
		
		
	}
}
