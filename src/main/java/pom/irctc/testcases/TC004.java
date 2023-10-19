package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.Accomodationpage;
import pom.irctc.pages.GuestLoginPage;
import pom.irctc.pages.Homepage;
import pom.irctc.pages.HotelDetailPage;
import pom.irctc.pages.HotelPage;
import pom.irctc.pages.OTPPage;
import pom.irctc.pages.PassengerDetailPage;
import pom.irctc.pages.SearchHotelPage;
import pom.irctc.pages.SummaryPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify  book hotels  in irctc application. ";
		author="Sanjita";
		category="Smoke";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test

	public void bookhotelgstno() {
		
		
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
		.selectGSTYesOrNo("No")
		.verifyHotelName(HotelDetailPage.hotelname)
		.verifyPrice(HotelDetailPage.price)
		.clickonGo()
		.clickOnIAgree()
		.clickonMakePayment()
		.clickonVerifyButton()
		.VerifyOTPErrorMsg("otp is required.");		
	}
	
}
