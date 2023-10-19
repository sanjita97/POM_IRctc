package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers {
	
    public GuestLoginPage clickonGuestUserLogin() {
		
		clickByXpath(prop.getProperty("GuestLoginPage.GuestUserLogin.Xpath"));
		return this;
	}
	
	public GuestLoginPage enterEmail(String data) {

		enterByXpath(prop.getProperty("GuestLoginPage.Email.Xpath"), data);
		return this;
	}

	public GuestLoginPage enterMobileNo(String data) {
		
		enterByXpath(prop.getProperty("GuestLoginPage.MobileNo.Xpath"), data);
		return this;
	}
	
	public HotelPage clickOnLoginButton() {
		
		clickByXpath(prop.getProperty("GuestLoginPage.LoginButton.Xpath"));
	    return new HotelPage();
	}

}
