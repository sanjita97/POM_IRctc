package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers {
	
public HotelPage switchToNextWindow() {
		
		switchToLastWindow();
		return this;
		
	}
	public GuestLoginPage clickonLogin() {
		
		clickByXpath(prop.getProperty("HotelPage.Login.Xpath"));
		return new GuestLoginPage();		
	}

	public HotelPage enterDestination(String data) {
		//clickByXpathNoSnap("//input[@id='filterText']/..");
		waitProperty(3000);
		enterByXpath(prop.getProperty("HotelPage.DestinationEnter.Xpath"),data);

		return this;		
	}

	public HotelPage selectDestination() {

		clickByXpath(prop.getProperty("HotelPage.DestinationSelect.Xpath"));

		return this;		
	}
	
	public HotelPage selectCheckInDate(String data) {
		clickByXpath(prop.getProperty("HotelPage.CheckInDate.Xpath"));
		clickByXpath(prop.getProperty("HotelPage.CheckInDateEnter.Xpath").replaceAll("data", data));

		return this;
	}
	
	public HotelPage selectCheckOutDate(String data) {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutDate.Xpath"));
		clickByXpath(prop.getProperty("HotelPage.CheckOutDateEnter.Xpath").replaceAll("data", data));
		return this;
	}
	
	public HotelPage selectRoom(String data) {
		
		clickByXpath(prop.getProperty("HotelPage.RoomClick.Xpath"));
		selectVisibileTextByXpath(prop.getProperty("HotelPage.HotelRoom.Xpath"), data);
		return this;		
	}
	
    public HotelPage selectAdultsNo(String data) {
		
		selectVisibileTextByXpath(prop.getProperty("HotelPage.AdultsNo.Xpath"), data);
		return this;		
	}

	public HotelPage clickOnDoneButton() {
		
		clickByXpath(prop.getProperty("HotelPage.DoneButton.Xpath"));
		return this;
	}
	
	public SearchHotelPage clickOnFindHotel() {
		
		clickByXpath(prop.getProperty("HotelPage.FindHotel.Xpath"));
		return new SearchHotelPage();
	}
	
	
	
	
	
}
