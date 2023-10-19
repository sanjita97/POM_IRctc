package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailPage extends GenericWrappers {
	
public static String hotelname = null;
	
	public static String price = null;

	
    public HotelDetailPage switchToNextWindow() {
		
		switchToLastWindow();
		return this;
		
	}
 public HotelDetailPage getHotelNameandPrintinConsole()  {
		
		hotelname = getTextByXpath(prop.getProperty("HotelDetailPage.HotelNameandPrintinConsole.Xpath"));
		return this;
		
	}
	
	public HotelDetailPage getPriceandPrintinConsole() {
		
	price =	getTextByXpath(prop.getProperty("HotelDetailPage.PriceandPrintinConsole.Xpath"));
		return this;
	}

	
    
   	public PassengerDetailPage clickonContinuetoBook() {
		
		clickByXpath(prop.getProperty("HotelDetailPage.ContinuetoBook.Xpath"));
		return new PassengerDetailPage();		
	}
	

	
	
	
	
	
}
