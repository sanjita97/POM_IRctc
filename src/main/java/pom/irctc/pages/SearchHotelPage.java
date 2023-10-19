package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SearchHotelPage extends GenericWrappers {

	
	
    public HotelDetailPage clickOnfirstdisplayedHotel() {
    	clickByXpath(prop.getProperty("SearchHotelPage.firstdisplayedHotel.Xpath"));
		return new HotelDetailPage();
	}
	
	

}

